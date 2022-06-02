package exercicio4;

public class Pangrama {

    public String frase = "Zebras caolhas de Java querem passar fax para moças gigantes de New York";
    public String frase2 = "Jane quer LP, fax, CD, giz, TV e bom whisky";
    public String frase3 = "Cheguei aqui";

    public int stringLength = frase.length();
    public int stringLength2 = frase2.length();
    public int stringLength3 = frase3.length();

    public static void main(String[] args) {
        Pangrama fr1 = new Pangrama();
        Pangrama fr2 = new Pangrama();
        Pangrama fr3 = new Pangrama();
        if (fr1.stringLength > 13){
            System.out.println("é pangama");
    }if(fr2.stringLength2 > 13){
            System.out.println("é pangrama");
        }if(fr3.stringLength3 < 13){
            System.out.println("nao é pangrama");
        }
        }

}




