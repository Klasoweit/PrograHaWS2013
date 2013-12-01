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
	 * Gegeben ist der Rump einer zirkul�r doppelt-verketteten Liste. In so
	 * einer Liste kann von jedem Elemtn auf das vorherige und dsa nachfoglende
	 * Element der Liste zugegriffen werden. Die Elemente formen einen Kreis,
	 * die Liste hat also keinen Anfang oder Ende.
	 *  1. Implementieren Sie die
	 * Methode public int size(), welhe die Anzahl an Elementen in der Liste
	 * zur�ckgibt.
	 *  2. Implementieren Sie die Methode public
	 * CircualrDoubleLinkedList insert(int value). Die Methode soll einen neues
	 * Element zur Liste hinzuf�gen und eine Referenz auf dieses Element
	 * zur�ckgeben.
	 *  3. Implementieren Sie die Methode public boolean
	 * checkStructure() um folgende Invariante der Liste zu �berpr�fen: ein
	 * Listenelement hat ein Vorg�ngerlement previous und ein Nachfolgerelement
	 * next, beide d�rfen nicht null sein. Weiterhi gilt f�r jedes
	 * Listenelement, dass der Vorg�nger des Nachfolgers das Element selbst ist;
	 * genauso verh�lt es sich mit dem Nachfolger des Vorg�ngers. Die Methode
	 * checkStructure() soll diese Invariante f�r das Element, f�r welches sie
	 * aufgerufen wird, �berpr�fen und genau dann true zur�ckgeben, wenn diese
	 * Invariante gegeben ist.
	 * Rufen sie checkStructure() in einem assert vor und
	 * nach dem Ausf�hren jeder public Methide f�r jedes ge�nderte Element sowie
	 * jedes Element, dass eine Referent auf ein ge�ndertes Element besitzt,
	 * auf. Pr�fen Sie mit einem solchen assert auch, ob die Invariante am Ende
	 * jedes Konstruktors f�r das gerade erzeugte Element gilt.
	 * (a) Stellt diese Invariante sicher, dass die Liste immer kreisf�rmig ist?
	 * (b) Stellt diese Invariante sicher, dass die Liste, welche von insert
	 * 	   zur�ckgegeben wird, auch alle Elemente der urspr�nglichen Liste beinhaltet?
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