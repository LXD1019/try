package test.methodTest;

public class UUID {
    public static void main(String[] args) {

        /*System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println();
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println();
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));*/

        String a = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_dtgl` (id,name,sequence,is_leaf,wz_name) VALUES ('" + a +"','监督检查',10,0,'监督检查')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + a + "','建筑工程质量管理抽查记录','市场监督_建筑工程质量管理抽查记录')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + a + "','施工单位质量行为监督抽查记录','市场监督_施工单位质量行为监督抽查记录')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + a + "','监理单位质量行为监督抽查记录','市场监督_监理单位质量行为监督抽查记录')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + a + "','建筑工程质量监督工作方案','市场监督_建筑工程质量监督工作方案')");
        System.out.println();
        String b = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_dtgl` (id,name,sequence,is_leaf,wz_name) VALUES ('" + b + "','违规处理',20,0,'违规处理')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + b + "','安全隐患整改报告','违规处理_安全隐患整改报告')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + b + "','安全隐患限期整改通知书','违规处理_安全隐患限期整改通知书')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + b + "','安全隐患停工整改通知书','违规处理_安全隐患停工整改通知书')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + b + "','建筑工程质量整改通知书','违规处理_建筑工程质量整改通知书')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + b + "','质量整改情况报告书','违规处理_质量整改情况报告书')");
        System.out.println();
        String c = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_dtgl` (id,name,sequence,is_leaf,wz_name) VALUES ('" + c + "','监督验收',30,0,'监督验收')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "','终止施工安全监督告知书','监督验收_终止施工安全监督告知书')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "','分户验收抽查记录','监督验收_分户验收抽查记录')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "','建筑工程竣工验收监督记录','监督验收_建筑工程竣工验收监督记录')");
        System.out.println("INSERT INTO `dict_dtgl` (id,parent_id,name,wz_name) VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "','工程质量监督报告','监督验收_工程质量监督报告')");


    }
}
