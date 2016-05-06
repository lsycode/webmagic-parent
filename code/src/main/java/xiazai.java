///**
// * Created by lsy on 2016/5/6.
// */
//public class xiazai {
//    @RequestMapping(value = "sql/download")
//    public String sqlDownload(HttpServletRequest request,
//                              HttpServletResponse response) throws IOException, JSONException,
//            FileUploadException {
//        JSONObject ret = new JSONObject();
//        GameCdkey info = GameCdkeyBIZ.getGameCdkeyFromDBById(3l);
//        String data = info.getData();
//        String[] strs = data.split("\r\n");
//        StringBuilder sb = new StringBuilder();
//        Long gid = 0l;
//        for (int i = 0; i < strs.length; i++) {
//            sb.append("INSERT INTO user_cdkey ( `gid`, `type`, `cdkey`, `count`, `status`) ");
//            sb.append(" VALUES ( ");
//            sb.append(gid + " , ");
//            sb.append(gid + " , ");
//            sb.append("'" + strs[i] + "'" + ", ");
//            sb.append(0 + ", ");
//            sb.append(0 + " );\n");
//        }
//        // 1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
//        response.setContentType("multipart/form-data");
//        // 2.设置文件头：最后一个参数是设置下载文件名(假如我们叫a.pdf)
//        response.setHeader("Content-Disposition", "attachment;fileName="
//                + "cdkey.sql");
//        ServletOutputStream out = response.getOutputStream();
//        ByteArrayInputStream bs = new ByteArrayInputStream(sb.toString()
//                .getBytes());
//        int b = 0;
//        byte[] buffer = new byte[512];
//        while (b != -1) {
//            b = bs.read(buffer);
//            // 4.写到输出流(out)中
//            out.write(buffer, 0, b);
//        }
//        return null;
//    }
//}
