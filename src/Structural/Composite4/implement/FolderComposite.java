package Structural.Composite4.implement;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite extends FileComponet {
    private List<FileLeaf> files = new ArrayList<>();

    public FolderComposite(List<FileLeaf> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (FileLeaf file : files) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileLeaf file : files) {
            total += file.totalSize();
        }
        return total;
    }
}
