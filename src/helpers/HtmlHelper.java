package helpers;

import javax.servlet.ServletConfig;

/**
 * Created by mrahbari on 3/1/2016.
 */
public class HtmlHelper {

    public ServletConfig config;

    /**
     * class constructor
     */
    public HtmlHelper() {
    }

    /**
     * return suitable direction based on language
     *
     * @return
     */
    public boolean isRTL() {

        String currentLanguage = "fa";//config.getInitParameter("lang");
        if ((currentLanguage != null) && ((currentLanguage.equals("fa") || currentLanguage.equals("ar"))))
            return true;

        return false;
    }

    /**
     * get the file extension
     *
     * @param fileName
     * @return
     */
    public String getExtension(String fileName) {

        String extension = null;
        if ((!this.isRTL()) || (fileName.equals("")) || (fileName == null))
            return null;

        int i = fileName.lastIndexOf('.');
        if (i >= 0) {
            extension = fileName.substring(i + 1);
        }

        if (extension.length() > 3)
            return null;

        return extension;
    }

    /**
     * .rtl will be added to the file name if the languages direction is RTL
     *
     * @param fileName
     * @return
     */
    public String getI18n(String fileName) {

        // return if direction isn't rtl
        if ((!this.isRTL()) || (fileName == null || fileName.equals("")))
            return fileName;

        // get extension of file name
        String extension = this.getExtension(fileName);

        // evaluate extension validity
        if (extension != null) {
            int compressFileName = fileName.indexOf(".min.");
            if (compressFileName >= 0) {
                return fileName.replace(".min." + extension, ".rtl.min." + extension);
            } else {
                return fileName.replace("." + extension, ".rtl." + extension);
            }
        }

        return fileName;
    }

    /**
     * return direction based on language
     *
     * @return RTL|LTR
     */
    public String getDirection() {
        if (this.isRTL())
            return "rtl";

        return "ltr";
    }

    /**
     * main class
     * @param args
     */
    public static void main(String[] args) {

        HtmlHelper htmlHelper = new HtmlHelper();

        String fileName = "theme.style.css";
        String fileName2 = "theme.style.min.css";
        System.out.println(htmlHelper.getI18n(fileName));
        System.out.println("get I18n: " + htmlHelper.getI18n(fileName2));
        System.out.println("is RTL: " + htmlHelper.isRTL());
        System.out.println("get Extension: " + htmlHelper.getExtension(fileName));
        System.out.println("get Direction: " + htmlHelper.getDirection());

     }

}
