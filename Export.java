import java.io.File;

/**
 * @author Lillian Bentley
 */

// Abstract class for Export, which is used by Print, Email, SendToDrive, and Downloader
abstract class Export {

    abstract void getContent(File file);

}
