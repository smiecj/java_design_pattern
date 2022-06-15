package design.builder.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// TextBuilder: 打印标准输出
public class HTMLBuilder extends Builder {

    private String fileName;
    // PrintWriter: 比 FileWriter 更好用
    private PrintWriter pw = null;

    @Override
    public void buildTitle(String title) {
        fileName = title + ".html";
        try {
            pw = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        pw.println("<html><head><title>" + title + "</title></head><body>");
        pw.println("<h1>" + title + "</h1>");
    }

    @Override
    public void buildString(String str) {
        pw.println("<p>" + str + "</p>");
    }

    @Override
    public void buildItems(String[] items) {
        pw.println("<ul>");
        for (String item : items) {
            pw.println("<li>" + item + "</li>");
        }
        pw.println("</ul>");
    }

    @Override
    public void closeDone() {
        pw.println("</body></html>");
        pw.close();
    }

    public String getResult() {
        return fileName;
    }

}
