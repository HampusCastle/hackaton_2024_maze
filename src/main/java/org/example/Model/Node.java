package org.example.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*#####################################################################################

       DENNA KLASS HÅLLER KOLL OCH ANVÄNDS SOM MODELL- OCH OBJEKTKLASS FÖR ARRAYEN
                    NI HÅLLER OBJEKTET NODE I VISITEDNODES-LISTAN
                 HÄR BEHÖVS DET INTE GÖRAS SÅ MYKCET MEN DET KAN VARA BRA
                  ATT GÖRA SIG BEKVÄM MED VAD NI LAGRAR, OCH VARFÖR

                                blir bra
                                 HAPPY CODING!
#####################################################################################*/


@Getter
@Setter
@AllArgsConstructor
public class Node {

    private int row;
    private int column;
    private int value;

    @Override
    public String toString() {
        return  "[" + row + ", " + column + "]";
    }
}
