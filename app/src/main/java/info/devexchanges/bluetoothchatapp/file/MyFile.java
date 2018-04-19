package info.devexchanges.bluetoothchatapp.file;

import java.io.File;

public class MyFile {
    private File file;
    private FileChangeListener fileChangeListener;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
        if(fileChangeListener != null) {
            fileChangeListener.onChange();
        }
    }

    public FileChangeListener getFileChangeListener() {
        return fileChangeListener;
    }

    public void setFileChangeListener(FileChangeListener fileChangeListener) {
        this.fileChangeListener = fileChangeListener;
    }

    public interface FileChangeListener {
        void onChange();
    }
}
