package basics.designPatterns.iteratorPattern.examQuestion.dec2019Q3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dir extends Node implements Iterable<Node> {
    private List<Dir> directories = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    public Dir(String name) {
        super(name);
    }

    @Override
    public Iterator<Node> iterator() {
        return new DirIterator();
    }

    public void addDir(Dir info) {
        directories.add(info);
    }

    public void addFile(File info) {
        files.add(info);
    }

    private class DirIterator implements Iterator<Node> {
        Iterator<Dir> dirIterator = directories.iterator();
        Iterator<File> fileIterator = files.iterator();

        @Override
        public boolean hasNext() {
            return dirIterator.hasNext() || fileIterator.hasNext();
        }

        @Override
        public Node next() {
            if (dirIterator.hasNext()) {
                return dirIterator.next();
            }

            return fileIterator.next();
        }
    }

    public static void main(String[] args) {
        Dir dir0 = new Dir("Dir0");
        Dir dir1 = new Dir("Dir1");
        Dir dir2 = new Dir("Dir2");
        File file1 = new File("File1");
        File file2 = new File("File2");

        dir0.addDir(dir1);
        dir0.addDir(dir2);
        dir0.addFile(file1);
        dir0.addFile(file2);

        for (Node child : dir0) {
            System.out.println(child.getName());
        }
    }
}
