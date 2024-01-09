package src.module2.task2.ex5;

public class School {
    private int pos = 0;
    private String title;
    private String specType;
    private int espCount;
    private Esper[] espers;

    public School(String title, int espCount) {
        this.title = title;
        this.espCount = espCount;
        this.espers = new Esper[espCount];
    }

    public School(String title, String specType, int espCount) {
        this.title = title;
        this.specType = specType;
        this.espCount = espCount;
        this.espers = new Esper[espCount];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType;
    }

    public int getEspCount() {
        return espCount;
    }

    public void setEspCount(int espCount) {
        this.espCount = espCount;
    }

    public Esper[] getEspers() {
        return espers;
    }

    public void setEspers(Esper[] espers) {
        this.espers = espers;
    }

    public boolean addEsper(Esper esper) {
        if (esper.getMighty() > 1000  && !esper.getType().equals(specType)){
            return false;
        }
        if (esper.getMighty() > 10) {
            espers[pos++] = esper;
            return true;
        }
        if (esper.getMighty() < 10) {
            return true;
        }
        return false;
    }

    public void addInSpecialSchool(Esper esper){
        espers[pos++] = esper;
    }

    public int getCount(){
        return pos;
    }
}
