public class Main {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("É esperado 1 input.");
        }
        int n_a = 0;
        for(int i = 0; i < args[0].length(); i++) {
            if(args[0].charAt(i) == 'A' || args[0].charAt(i) == 'a') {
                n_a++;
            }
        }
        if(n_a > 0) {
            System.out.println("Ocorreram " + n_a + " 'A'.");
        } else {
            System.out.println("Não ocorreu nenhum 'A'.");
        }
    }
}
