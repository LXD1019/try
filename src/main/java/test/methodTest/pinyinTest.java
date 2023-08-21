package test.methodTest;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import org.apache.commons.text.CaseUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pinyinTest {

    private final static String PreUrl = "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&ch=&tn=baidu&bar=&wd="; //百度搜索URL
    private final static String TransResultStartFlag = "<div class=\"op_dict3_title\">";    //翻译开始标签
    private final static String TransResultEndFlag = "</div>";

    public static void main(String[] args) {

        String[] a = new String[]{
                "创建时间", "修改时间"
        };

        //汉字转拼音首字母
        // 1
        String s = convertHanzi2Pinyin("创建时间", false);
        System.out.println(s);
        // 2
        //System.out.println(test("创建时间"));

        String camelCase = CaseUtils.toCamelCase("creattime", false, null);
        //System.out.println(camelCase);

        /*try {
            System.out.println(getTranslateResult("blue"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }

    public static String getTranslateResult(String urlString) throws Exception {    //传入要搜索的单词
        URL url = new URL(PreUrl + urlString);            //生成完整的URL
        // 打开URL
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        // 得到输入流，即获得了网页的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String preLine = "";
        String line;
        int flag = 1;
        // 读取输入流的数据，并显示
        String content = "";          //翻译结果
        while ((line = reader.readLine()) != null) {            //获取翻译结果的算法
            if (preLine.indexOf(TransResultStartFlag) != -1 && line.indexOf(TransResultEndFlag) == -1) {
                content += line.replaceAll("　| ", "") + "\n";   //去电源代码上面的半角以及全角字符
                flag = 0;
            }
            if (line.indexOf(TransResultEndFlag) != -1) {
                flag = 1;
            }
            if (flag == 1) {
                preLine = line;
            }
        }
        return content;//返回翻译结果
    }


    public static String test(String s) {
        String tempStr = null;

        try {
            tempStr = com.github.stuxuhai.jpinyin.PinyinHelper.getShortPinyin(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tempStr;
    }

    public static String convertHanzi2Pinyin(String hanzi, boolean full) {
        /***
         * ^[\u2E80-\u9FFF]+$ 匹配所有东亚区的语言
         * ^[\u4E00-\u9FFF]+$ 匹配简体和繁体
         * ^[\u4E00-\u9FA5]+$ 匹配简体
         */
        String regExp = "^[\u4E00-\u9FFF]+$";
        StringBuffer sb = new StringBuffer();
        if (hanzi == null || "".equals(hanzi.trim())) {
            return "你没输入！";
        }
        String pinyin = "";
        for (int i = 0; i < hanzi.length(); i++) {
            char unit = hanzi.charAt(i);
            if (match(String.valueOf(unit), regExp)) {//是汉字，则转拼音
                pinyin = convertSingleHanzi2Pinyin(unit);
                if (full) {
                    sb.append(pinyin);
                } else {
                    sb.append(pinyin.charAt(0));
                }
            } else {
                sb.append(unit);
            }
        }
        return sb.toString();
    }

    /***
     * 将单个汉字转成拼音
     * @param hanzi
     * @return
     */
    private static String convertSingleHanzi2Pinyin(char hanzi) {
        HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();
        outputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        String[] res;
        StringBuffer sb = new StringBuffer();
        try {
            res = PinyinHelper.toHanyuPinyinStringArray(hanzi, outputFormat);
            sb.append(res[0]);//对于多音字，只用第一个拼音
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return sb.toString();
    }

    /***
     * @param str 源字符串
     * @param regex 正则表达式
     * @return 是否匹配
     */
    public static boolean match(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    /**
     * 首字母转大写、驼峰命名
     *
     * @param s 待转换的字符串
     * @return 转换结果
     */
    public static String initialToCapital(String s) {
        StringBuilder sb = new StringBuilder();
        if (s == null || s.trim().isEmpty()) {
            return sb.toString();
        }
        if (s.length() <= 1) {
            return sb.append(s).toString().toUpperCase();
        }
        String[] split = s.split("_");
        for (String string : split) {
            sb.append(string.substring(0, 1).toUpperCase());
            sb.append(string.substring(1).toLowerCase());
        }
        return sb.toString();
    }

}
