//структура, содержащая сама себя и листики(дерево)

import java.util.ArrayList;
import java.util.List;

public class Composite {
}
class File{}
class Folder{
    String name;
    int size;
    List<Folder> folders = new ArrayList<>();
    List<File> files = new ArrayList<>();
    public Folder(String name, int size){
        this.name=name;
        this.size=size;
    }
    void Add(Folder folder){
        folders.add(folder);
    }
    void Remove(Folder folder){
        folders.remove(folder);
    }
    void Remove(int IndexFolder){
        folders.remove(IndexFolder);
    }
    void Show(List<Folder> folder){
        System.out.println(folders.toString());
    }
    void Add(File file){}
    void Remove(File file){}
    void RemoveFile(int IndexFile){}
    void ShowFiles(List<File> file){}
}
