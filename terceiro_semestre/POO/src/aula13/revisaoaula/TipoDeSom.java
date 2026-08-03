package aula13.revisaoaula;

enum TipoDeSom { NORMAL, NERVOSO, COM_MEDO; }
class GatoEnum{
    public void emitirSom() {
        System.out.println("Miau");
    }
    public void emitirSom(TipoDeSom tipo) {
        switch (tipo) {
            case NORMAL: System.out.println("Miau"); break;
            case NERVOSO: System.out.println("MIAU!!"); break;
            case COM_MEDO: System.out.println("miau..."); break;
        }
    }
}