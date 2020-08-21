package Structural.Composite4.implement;

import java.util.Arrays;
import java.util.List;

public class client {
    public static void main(String[] args) {
        FileLeaf file1 = new FileLeaf("file 1", 10);
        FileLeaf file2 = new FileLeaf("file 2", 5);
        FileLeaf file3 = new FileLeaf("file 3", 12);

        List<FileLeaf> files = Arrays.asList(file1, file2, file3);
        FolderComposite folder = new FolderComposite(files);
        folder.showProperty();
        System.out.println("Total Size: " + folder.totalSize());

    }
}
