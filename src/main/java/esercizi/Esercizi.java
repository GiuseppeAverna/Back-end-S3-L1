package esercizi;

public class Esercizi {
    /* estrai i clienti d inome Mario:
    SELECT *
    FROM public."Clienti"
    WHERE "Nome" = 'Mario';

    estrarre nomi e cognomi dei clienti nati nel 1982:
    prima inserisco con scrpt inserto to
    INSERT INTO public."Clienti"(
	"NumeroCliente", "Nome", "Cognome", "Anno di Nascita", "Regione di Residenza")
	VALUES (8, 'Riccardo', 'Brando', 1982, 'Italia');
	poi col seelletore, prendo i nomi e cognomi dei clienti nati nel 1982:
	SELECT *
	FROM public."Clienti"
	WHERE "Anno di Nascita" = 1982

	estrarre fatture con iva al 20%
	INSERT INTO public."Fatture"(
	"NumeroFattura", "Tipologia", "Importo", "Iva", "IdCliente", "DataFattura", "NumeroFornitore")
	VALUES
	(21, 'Acquisto', 250, 20, 2, '12/02/2020' ,2),
	(3, 'Acquisto', 170, 22, 1, '13/05/2019' ,3);
	SELECT *
	FROM public."Fatture"
	WHERE "Iva"=20;

    estrarre le fatture con importo inferiore a 1000 e i dati dei client

}







*/
