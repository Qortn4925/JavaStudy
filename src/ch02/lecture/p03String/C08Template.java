package ch02.lecture.p03String;


public class C08Template {
    public static void main(String[] args) {
        String name = "흥민";
        int age = 33;

        //이름은 흥민 , 나이는 33
        String a = "이름은" + name + "나이는" + age;
        System.out.println("a = " + a);

        //string template
        String b = STR."이름은 \{name},나이는\{age}";
        System.out.println("b = " + b);

        String title = "내 웹페이지";
        String heading = "웹 페이지 제목";
        String para = "웹 페이지의 내용";

        String html1 = """
                <html>
                    <head>
                    <title> """
                + title + """
                </title>
                </head>
                <body>
                <h1>"""
                + heading + """
                </h1>
                <p>"""
                + para + """
                    </p>
                    </body>
                    </html>
                """;
        System.out.println("html1 = " + html1);
        String html2 = STR."""
                <html>
                    <head>
                    <title>\{title}</title>
                    </head>
                    <body>
                        <h1>\{heading}</h1>
                        <p>\{para}</p>
                    </body>
                </html>
                """;
        System.out.println("html2 = " + html2);

    }
}
