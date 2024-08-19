package ch02.lecture.p03String;

public class C07TextBlock {
    public static void main(String[] args) {


        // 스트링 에 긴 문장을 작성할 때 , 
        String a = "동해물과 백두산이 \n 마르고 닳도록\n";
        System.out.println("a = " + a);
        String b = "동해물과 백두산이\n" +
                "마르고 닳도록\n";
        System.out.println("b = " + b);

        // text block   """ 사이에 작성한 내용을 그대로 보여줌 """

        // 첫 """ 이후 엔터   
        // 가장 왼 쪽 들여쓰기 기준으로 결정
        String c = """
                동해물과 백두산이
                마르고 닳도록
                하느님이 보우하사
                우리 나라 만세
                """;
        System.out.println("c = " + c);
        String html1 = "<html> \n" +
                "   <head>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "   </body>\n" +
                "</html>\n";
        System.out.println("html1 = " + html1);
        String html2 = """
                <html>
                    <head>
                    </head>
                    <body>
                    </body>
                </html>
                """;
        System.out.println("html2 = " + html2);
    }
}
