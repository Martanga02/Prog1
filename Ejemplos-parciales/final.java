public class Final{
    public static final int MAXF=4, MAXC=42 ,MAXP=4 ,MAXS=26;
    public static final char DELIMITADOR=' ';
    public static voidd main (String[]args){
        char[][]matriz = {
            {' ','l','a',' ','c','a','s','a',' ','r','o','j','a',',',' ','a',' ','l','a',' ','v','u','e','l','t','a',' ','d','e',' ','l','a',' ','e','s','q','u','i','n','a',' ',' '},
            {' ','t','i','e','n','e',' ','m','u','c','h','a','s',' ','v','e','n','t','a','n','a','s',' ','d','e',' ','a','l','u','m','i','n','i','o',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ','y',' ','l','a','s',' ','p','u','e','r','t','a','s',' ','d','e',' ','m','a','d','e','r','a','.',' ','L','a','s',' ','c','o','r','t','i','n','a','s',' ',' ',' ',' '},
            {' ',' ','s','o','n',' ','d','e',' ','c','o','l','o','r',' ','n','e','g','r','o','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
        char[]stopwords = {' ','a',' ','l','o',' ','l','o','s',' ','d','e',' ','l','a',' ','l','a','s',' ','L','a','s',' ','y',' '};
        char[]P = {' ',',',';','!'};
    }


    public static int BuscarFin(int[]fila,int fin){
        while(fin<MAXC && fila[fin]!=DELIMITADOR){
            fin++;
        }
        return fin -1;
    }

    public static int BuscarIni(int[]fila,int ini){
        while(ini<MAXC && fila[ini]==DELIMITADOR){
            ini++;
        }
        return ini;
    }

    public static void ImprimirMatriz(char[][]mat){
        for(int i =0;i<MAXF;i++){
            for(int j =0;j<MAXC;j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println(" ");
        }
    }
}