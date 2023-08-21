package test.methodTest;

public class UUID2 {

    public static void main(String[] args) {

        String a = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + a + "', '-1', '400', '-', '项目部角色管理', '2023-05-13 10:07:01', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + a + "','ROLE_GCZL_JLY', '724', '工程资料监理员', '2023-05-13 10:10:17', '2023-05-26 10:22:07', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + a + "','ROLE_GCZL_ZJY', '712', '工程资料质检员', '2023-05-13 10:09:51', '2023-05-26 10:22:07', '0', '522636');");
        String b = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + b + "', '-1', '101', '-', '人员管理', '2021-06-09 16:28:36', '2023-05-26 10:22:09', '0', '522636');");
        String c = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + c + "', '-1', '200', NULL, '系统管理', '2021-06-20 10:24:50', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200103', '[yyyyMM]{0}', '问题交办单编码规则（年月+三位流水）', '2021-10-25 09:35:30', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200117', '【验收预约】工程项目：【工程项目】，预约编号：【预约编号】，【预约结果】', '分部验收预约短信', '2022-08-01 16:48:19', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200109', '于{shrq}已下整改通知书，详见整改通知号{tzsbh}', '下发整改通知书，自动下发巡查记录用（处理意见模板）', '2021-11-29 10:45:48', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200053', '宜昌市建筑市场和建设工程质量安全监督站（湖北省住房和城乡建设厅国家职业技能鉴定所第三鉴定站）', '电子签章发起方名称 正式', '2021-12-15 15:55:40', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200005', 'jdgl_message', '短信平台审核流程定义名称', '2021-10-23 21:29:11', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200004', 'jdgl_wtjbd', '问题交办单审核流程定义', '2021-10-25 09:35:09', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200101', '0', '测试环境还是正式环境 （0：测试 1：正式）', '2021-07-30 10:00:30', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200051', 'http://36.148.16.187:9000', '文件服务器的域名路径', '2021-11-04 18:06:47', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200052', '湖北升思科技股份有限公司', '电子签章发起方名称 测试', '2021-12-15 15:55:17', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200100', '[yyyy]-{0}', '工程注册的编码格式（年份+4位流水号）', '2021-07-02 14:33:42', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200006', 'jdgl_aqsg_rcpj', '安全文明施工标准化日常评价审核流程定义', '2022-06-01 18:11:19', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200121', '2', '是否区分质量安全整改编码类型（1：是，2：否）', '2022-08-17 10:27:37', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200099', '1', '1:监督注册人员证书可填可选 2:监督注册人员证书只能选择', '2021-06-20 10:44:04', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200110', '市场质量安全监督站【监督室】【监督员姓名】对【项目名称】进行实体检测监督委托登记，详情请登录系统查看。', '实体检测监督委托登记 短信模板', '2021-12-23 11:21:59', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200105', '[yyyyMM]{0}', '短信平台任务编码方式', '2021-11-29 10:39:14', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200112', '【监督抽检】【工程商混】：【项目商混】。检验编号：【检验编号】。使用部位：【使用部位】。检验结论：【检验结果】。最终结果以检测报告为准！', '监督抽检不合格短信模板', '2022-05-23 16:23:55', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200050', '/zlaqjd/jdjc/xcjl', '对多个工程下发隐患告知书、整改通知书时，自动生成其他巡查记录。（关联动态管理字典中的记录路径）', '2021-08-03 10:55:17', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200113', '{name}向您提交了编号为{jlbh}交办事项，请及时登录质量安全监督系统处理！', '信访交办单短信模板（交办人即分管领导收）', '2021-11-29 02:44:57', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200107', '{name}向您提交了编号为{jlbh}事项，请及时登录质量安全监督系统处理！', '问题交办单短信模板（交办人即分管领导收）', '2021-11-29 10:44:57', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200116', '市场质量安全监督站【监督员姓名】对【项目名称】进行实体检测监督委托登记，委托序号：【委托编号】，详情请登录检测系统查看。', '监督抽检实体检测短信模板【新】', '2022-08-01 16:47:10', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200002', '2', '1:市政与房建分开 2:市政与房建合并', '2021-06-20 10:32:00', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200098', '1', '监督注册是否显示新增一体化工程按钮；1、显示 0、不显示（目前黄石、宜荆荆恩需要显示）', '2021-07-26 17:51:48', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "','200120', '38', 'process.env.deptId', '2021-11-29 02:45:27', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200108', '{name}向您下达了编号为{jlbh}交办事项，回复截止时间为{hfjzrq}，请及时登录质量安全监督系统处理！', '问题交办单短信模板(处理人收)', '2021-11-29 10:45:27', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200114', '{name}向您下达了编号为{jlbh}交办事项，回复截止时间为{hfjzrq}，请及时登录质量安全监督系统处理！', '信访交办单短信模板(处理人收)', '2021-11-29 02:45:27', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "','200119', '宜昌市', 'process.env.city', '2021-11-29 02:45:27', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200115', '{name}向您下达了编号为{jlbh}交办事项，请及时登录质量安全监督系统处理！', '信访交办单短信模板(科室主任收)', '2021-11-29 02:45:27', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200001', '2', '1:质量安全分开 2:质量安全合并', '2021-06-20 10:25:19', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200106', 'http://36.148.16.187:9999/ycjd/appVersion/downloadApk', '监督app安装包更新的路径', '2021-11-29 10:42:34', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200111', '市场质量安全监督站【监督室】【监督员姓名】对【项目名称】进行材料抽样监督委托登记，详情请登录系统查看。', '材料抽样监督委托登记 短信模板', '2021-12-23 11:22:21', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + c + "', '200003', 'jdgl_merge_jdfa', '监督方案审核定义配置（合并）', '2021-07-22 16:53:08', '2023-05-26 10:22:09', '0', '522636');");

        String d = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + d + "', '-1', '100', '-', '部门管理', '2021-06-09 16:27:11', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + d + "', '100004', '38', '部门管理里质安合并部门ID', '2021-06-09 16:39:28', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + d + "', '100002', '65', '部门管理里安全部门ID', '2021-06-09 16:30:57', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + d + "', '100003', '44', '部门管理里市政部门ID', '2021-06-09 16:31:12', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + d + "', '100001', '62', '部门管理里质量部门ID', '2021-06-09 16:30:38', '2023-05-26 10:22:09', '0', '522636');");

        String e = java.util.UUID.randomUUID().toString().replace("-","");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + e + "', '-1', '300', NULL, '角色管理', '2021-06-30 08:49:56', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + e + "', 'ROLE_ZLAQJD_JDY_GZ_1', '240', '贵州质量安全监督综合监督员', '2021-10-28 13:52:56', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + e + "', 'ROLE_ZLAQJD_FGZZ_GZ_1', '181', '贵州质量安全分管站长', '2022-03-08 08:49:18', '2023-05-26 10:22:08', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + e + "', 'ROLE_ZLAQJD_XMB_YC', '214', '项目部用户', '2021-06-30 08:52:51', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + e + "', 'ROLE_ZLAQJD_FGZZ_YC', '136', '分管站长角色(质安合并角色)', '2021-07-10 10:08:07', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + e + "', 'ROLE_ZLAQJD_FGZZ_GZ_1', '136', '贵州质量安全分管站长', '2021-07-10 10:08:07', '2023-05-26 10:22:09', '0', '522636');");
        System.out.println("INSERT INTO `dict_config` VALUES ('" + java.util.UUID.randomUUID().toString().replace("-","") + "','" + e + "', 'ROLE_ZLAQJD_XMB_GZ_1', '269', '贵州质量安全监督项目部账号', '2021-10-28 13:52:33', '2023-05-26 10:22:09', '0', '522636');");


    }

}
