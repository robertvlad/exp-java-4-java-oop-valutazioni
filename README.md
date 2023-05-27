# exp-java-4-java-oop-valutazioni

State costruendo un programma per un corso di studi

La valutazione complessiva viene fatta sulla percentuale di assenze (da 0 a 100) e la media dei voti (da 0 a 5):

se lo studente ha fatto più del 50% di assenze è bocciato
se ha fatto tra il 25% e il 50% di assenze è promosso solo se la media dei voti è superiore a 2
se ha fatto meno del 25% di assenze è promosso se la media dei voti è superiore o uguale a 2
Implementazione
Nel progetto java-oop-valutazioni,
package org.lessons.java.valutazioni

inserire due classi:
Classe Studente con tre attributi:

id dello studente (intero),
percentuale assenze (intero),
media voti (numero decimale).
La classe deve avere anche un metodo che calcola, in base a percentuale assenze e media voti, se lo studente è promosso o bocciato.

Classe Main con metodo main in cui create un array di 20 Studente, lo popolate con id studente progressivo (da 1 a 20), percentuale assenze e media voti generati random.
Per ogni elemento dell’array stampate a video l’id studente e se è promosso o bocciato.

Prima di terminare il programma stampate a video quanti studenti sono stati promossi in tutto
