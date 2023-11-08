package Test.Reder;

public enum Facultet {
    MATHEMATICS("Математический"),PHYSICS("Физический"),GEOGRAPHY("Географический");
    private String nameFaculty ;

    Facultet(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }


}
