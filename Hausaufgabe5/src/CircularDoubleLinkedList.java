class CircularDoubleLinkedList {
	public CircularDoubleLinkedList previous, next;
	public int value;

	public CircularDoubleLinkedList(int value) {
		this.value = value;
		this.previous = this;
		this.next = this;
		assert (this.checkStructure());
	}

	private CircularDoubleLinkedList(int value,
			CircularDoubleLinkedList previous, CircularDoubleLinkedList next) {
		this.value = value;
		this.previous = previous;
		this.next = next;
	}

	/*
	 * Gegeben ist der Rump einer zirkulaer doppelt-verketteten Liste. In so
	 * einer Liste kann von jedem Elemtn auf das vorherige und dsa nachfoglende
	 * Element der Liste zugegriffen werden. Die Elemente formen einen Kreis,
	 * die Liste hat also keinen Anfang oder Ende.
	 *  1. Implementieren Sie die
	 * Methode public int size(), welhe die Anzahl an Elementen in der Liste
	 * zurueckgibt.
	 *  2. Implementieren Sie die Methode public
	 * CircualrDoubleLinkedList insert(int value). Die Methode soll einen neues
	 * Element zur Liste hinzufuegen und eine Referenz auf dieses Element
	 * zurueckgeben.
	 *  3. Implementieren Sie die Methode public boolean
	 * checkStructure() um folgende Invariante der Liste zu ueberpruefen: ein
	 * Listenelement hat ein Vorgaengerlement previous und ein Nachfolgerelement
	 * next, beide duerfen nicht null sein. Weiterhi gilt fuer jedes
	 * Listenelement, dass der Vorgaenger des Nachfolgers das Element selbst ist;
	 * genauso verhaelt es sich mit dem Nachfolger des Vorgaengers. Die Methode
	 * checkStructure() soll diese Invariante fuer das Element, fuer welches sie
	 * aufgerufen wird, ueberpruefen und genau dann true zurueckgeben, wenn diese
	 * Invariante gegeben ist.
	 * Rufen sie checkStructure() in einem assert vor und
	 * nach dem Ausfuehren jeder public Methide fuer jedes geaenderte Element sowie
	 * jedes Element, dass eine Referent auf ein geaendertes Element besitzt,
	 * auf. Pruefen Sie mit einem solchen assert auch, ob die Invariante am Ende
	 * jedes Konstruktors fuer das gerade erzeugte Element gilt.
	 * (a) Stellt diese Invariante sicher, dass die Liste immer kreisfoermig ist?
	 * (b) Stellt diese Invariante sicher, dass die Liste, welche von insert
	 * 	   zurueckgegeben wird, auch alle Elemente der urspruenglichen Liste beinhaltet?
	 */

	public CircularDoubleLinkedList insert(int value) {
		// TODO
	}

	public int size() {
		// TODO
	}

	public boolean checkStructure() {
		// TODO
	}
}