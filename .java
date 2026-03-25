alert("Benvenuto nel mio Linktree")
// A. Trova il pulsante e il corpo della pagina nel codice
 const pulsante = document.getElementById('theme-toggle');
 const corpo = document.body;

 // B. Resta in ascolto: cosa succede quando l'utente clicca?
 pulsante.addEventListener('click', () => {

 // C. "Accendi/Spegni" la classe .dark-mode sul body
 corpo.classList.toggle('dark-mode');

 // D. Cambia il testo del bottone per renderlo intelligente
 if (corpo.classList.contains('dark-mode')) {
 pulsante.innerText = " Modalità Luce";
 } else {
 pulsante.innerText = " Modalità Notte";
}

});