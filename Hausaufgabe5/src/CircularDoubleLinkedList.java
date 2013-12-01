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
	 * Gegeben ist der Rump einer zirkulär doppelt-verketteten Liste. In so
	 * einer Liste kann von jedem Elemtn auf das vorherige und dsa nachfoglende
	 * Element der Liste zugegriffen werden. Die Elemente formen einen Kreis,
	 * die Liste hat also keinen Anfang oder Ende.
	 *  1. Implementieren Sie die
	 * Methode public int size(), welhe die Anzahl an Elementen in der Liste
	 * zurückgibt.
	 *  2. Implementieren Sie die Methode public
	 * CircualrDoubleLinkedList insert(int value). Die Methode soll einen neues
	 * Element zur Liste hinzufügen und eine Referenz auf dieses Element
	 * zurückgeben.
	 *  3. Implementieren Sie die Methode public boolean
	 * checkStructure() um folgende Invariante der Liste zu überprüfen: ein
	 * Listenelement hat ein Vorgängerlement previous und ein Nachfolgerelement
	 * next, beide dürfen nicht null sein. Weiterhi gilt für jedes
	 * Listenelement, dass der Vorgänger des Nachfolgers das Element selbst ist;
	 * genauso verhält es sich mit dem Nachfolger des Vorgängers. Die Methode
	 * checkStructure() soll diese Invariante für das Element, für welches sie
	 * aufgerufen wird, überprüfen und genau dann true zurückgeben, wenn diese
	 * Invariante gegeben ist.
	 * Rufen sie checkStructure() in einem assert vor und
	 * nach dem Ausführen jeder public Methide für jedes geänderte Element sowie
	 * jedes Element, dass eine Referent auf ein geändertes Element besitzt,
	 * auf. Prüfen Sie mit einem solchen assert auch, ob die Invariante am Ende
	 * jedes Konstruktors für das gerade erzeugte Element gilt.
	 * (a) Stellt diese Invariante sicher, dass die Liste immer kreisförmig ist?
	 * (b) Stellt diese Invariante sicher, dass die Liste, welche von insert
	 * 	   zurückgegeben wird, auch alle Elemente der ursprünglichen Liste beinhaltet?
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