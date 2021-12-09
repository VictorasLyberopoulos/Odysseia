# Odysseia
NA GRAPSEI KAPOIOS MIA PERILIPSI TOU KODIKA 



Οδηγίες Χρήσης για τα παιδιά που θα καταχωρήσουν τις ερωτήσεις


Τρέχουμε το αρχείο Eisagwgi_erot.java (exei dikia tou main)
ακολουθούμε το menu που εμφανίζεται στο terminal
δεν ξεχνάμε να πατήσουμε 0 στο τέλος γιατί ΜΟΝΟ με το 0 αποθηκεύονται οι ερωτήσεις 



Οδηγίες Χρήσης για τα παιδιά που θα δημιουργήσουν το UI

Οι ερωτήσεις αποθηκέυονται σε 3 αρχεία  με κατάληξη (.ser)
κάθε ενα απο αυτά τα αρχεία έχει αποθηκευμένο μέσα του ενα ArrayList το οποίο ΄δεχεται ανττικείμενα της κλάσης Εrotisi.java
για να διαβάσετε τα αρχεία μέσα στο πρόγραμμα σας πρέπει να δημιουργήσεται  : 
	static ArrayList<Erotisi> epipedo1 = new ArrayList<Erotisi>();
	static ArrayList<Erotisi> epipedo2 = new ArrayList<Erotisi>();
	static ArrayList<Erotisi> epipedo3 = new ArrayList<Erotisi>();
   και να προσθέσεται στον κώδικα σας απο την κλάση Eisagwgi_erot.java την συνάρτηση  : load_files () η οποία διαβάζει τα 3 αρχεία (.ser) και γεμίζει αυτόματα τα παραπάνω ArrayList
  


