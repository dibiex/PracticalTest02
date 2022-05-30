package ro.pub.cs.systems.pdsd.practicaltest02.model;

public class DictionaryWord {
    private String name;
    private String definition;


    public DictionaryWord(){
        this.name = null;
        this.definition = null;
    }


    public DictionaryWord(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "DictionaryWord{" +
                "word='" + name + '\'' +
                ", definition='" + definition +'}';
    }
}
