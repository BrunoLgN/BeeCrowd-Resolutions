package app.resolutions;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
/*
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        FilaDoRecreio filaDoRecreio = new FilaDoRecreio();
        ArrayList<Integer> notas = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            notas.clear();

            for (int j = 0; j < M; j++) {
                notas.add(sc.nextInt());
            }

            
            System.out.println(filaDoRecreio.compara(notas, filaDoRecreio.ordena(new ArrayList<>(notas))));
        }

        sc.close();
    }
}*/

class FilaDoRecreio {

    
    public ArrayList<Integer> ordena(ArrayList<Integer> chegada) {
        for (int i = 0; i < chegada.size() - 1; i++) {
            for (int j = 0; j < chegada.size() - 1 - i; j++) {
                
                if (chegada.get(j) < chegada.get(j + 1)) {
                    int temp = chegada.get(j);
                    chegada.set(j, chegada.get(j + 1));
                    chegada.set(j + 1, temp);
                }
            }
        }
        return chegada;
    }


    public Integer compara(ArrayList<Integer> chegada, ArrayList<Integer> chegadaOrdenada) {
        int num = 0;
        for (int i = 0; i < chegada.size(); i++) {
            if (chegada.get(i).equals(chegadaOrdenada.get(i))) {
                num++;
            }
        }
        return num;
    }
}

