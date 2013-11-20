public class Set {
	/*
	 * T7
	 * 
	 * Implementieren Sie eine Klasse Set, deren Instanzen Mengen natuerlicher
	 * Zahlen darstellen. Die Klasse Set soll die Methode add(int x),
	 * contains(int x) und remove(int x) zur Verfuegung stellen. Dabei sollen
	 * die Attribute jeder Instanz der Klasse Set unveraenderbar sein, nachdem
	 * sie im Konstruktor gesetzt wurden. Die Menge wird dafuer durch eine Liste
	 * von Set Objekten repraesentiert. Jedes Set Objekt enthaelt eine Operation
	 * und eine Referenz zu einem anderen Set Objekt (oder null, wenn es das
	 * lezte Element der Liste ist). Jede Operation soll entweder eine Einfuege-
	 * oder eine Loeschoperation sein. Die Methoden add(int x) und remove(int x)
	 * geben ein neues Set Objekt zurueck, welches der neue Kopf der Liste ist
	 * und eine Einfuege- oder Loeschoperation repraesentiert. Die Methode
	 * contains(int x) entscheidet, ob eine Element in der Menge ist oder nicht,
	 * indem sie die Einfuege- oder Loeschoperationen, die bereits ausgefuehrt
	 * wurden druchlaeuft.
	 */
	public Set(Set nextElem_, int content_) {
		final Set nextElem = nextElem_;
		final int content = content_;
	}

	public Set add(int x) {
		return null;
	}

	public Set remove(int x) {
		return null;
	}

	public void contains(int x) {

	}

	/*
	 * H9
	 * 
	 * Erweitern Sie die Klase Set aus Aufgabe T7 indem sie zu der Klasse die
	 * Methoden intersection(Set other) und union(Set other) hinzufuegen. Die
	 * Methode intersection(Set other) soll ein Set zurueckgeben was nur die
	 * Elemente enthaelt, die sowohl in der Menge sind worauf die Methode
	 * aufgerufen wurde, als auch die Menge other. Die Methode union(Set other)
	 * soll ein Set zurueckgeben was alle Elemente aus der Menge worauf die
	 * Methode aufgerufen wurde enthaelt, als auch die Element aus der Menge
	 * other. Dabei sollen die Attribute jeder Instanz der Klasse Set, wie davor
	 * unveraenderbar seindm nachdem sie im Konstruktor gesetzt wurden. Eine
	 * leere Menge kann dabei auch durch den Wert null representiert werden.
	 */

	public Set intersection(Set other) {
		return null;
	}

	public Set union(Set other) {
		return null;
	}
}
