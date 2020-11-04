public class Test {
    public static void main(String[] args) {
        System.out.printf("\n\n");
        
        double numero = 50.4373;

        System.out.printf("->%4.2f \n", numero);

        System.out.printf("->%4.0f \n", numero);

        System.out.printf("->%5.1f \n", numero);

        System.out.printf("->07.3f \n", numero);

        /* Com relação ao ultimo printf
        % -> indica que a seguir existem caracteres especiais
        0 -> indica que o espaço extra deve ser preenchido por 0's, em caso de nao ter o 0 o espaço seria preenchido com " " <- espaço
        7 -> indica que o valor a printar tem no minimo 7 caracteres
        .3 -> indica que o valor a printar deverá ter apenas 3 digitos decimais
        f -> indica que o valor a printar é do tipo float/double
        */
        
        System.out.printf("\n\n");
    }
}
