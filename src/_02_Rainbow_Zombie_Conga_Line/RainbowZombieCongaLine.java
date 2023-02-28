package _02_Rainbow_Zombie_Conga_Line;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {

	/*
	 * You are hosting a rainbow zombie conga dance party! Zombies are not very
	 * smart(maybe that's why they crave brains) and need your help to direct them
	 * through the choreography.
	 * 
	 * Each method is a dance move you will need to implement.
	 * 
	 * When you think you've gotten your zombies trained well enough you can start
	 * the party by running the main method in RainbowZombieDanceParty and typing
	 * how many rounds you want in the console to see if they followed your
	 * choreography correctly.
	 * 
	 * Note: The party will always start with a rainbow brains and every 5 rounds
	 * the head and tail of the dance line will be removed.
	 */

	private LinkedList<Zombie> congaLine;
	private ZombieHatColor[] zombieHats;

	public RainbowZombieCongaLine() {

		congaLine = new LinkedList<Zombie>();
		zombieHats = ZombieHatColor.values();

	}

	// Make the passed in zombie the first Zombie in the conga line!
	public void engine(Zombie dancer) {
		Node first = new Node(dancer);
		congaLine.setHead(first);

	}

	// Make the passed in zombie the last Zombie in the conga line!
	public void caboose(Zombie dancer) {
		Node last = new Node(dancer);
		congaLine.setTail(last);
	}

	// Place the zombie at the designated position in the conga line!
	public void jumpInTheLine(Zombie dancer, int position) {
		Node<Zombie> middle = new Node<Zombie>(dancer);

		for (int i = 0; i < position; i++) {
			middle.getNext();
		}

	}

	/*
	 * Remove all zombies with the same hat color as the passed in zombie from the
	 * conga line!
	 */
	public void everyoneOut(Zombie dancer) {
		ZombieHatColor color = dancer.getZombieHatColor();
		Node<Zombie> first = congaLine.getHead();
		while (first != null) {
			if (color == first.getValue().getZombieHatColor()) {
				first = first.getNext();
			}
		}
	}

	/*
	 * Remove the first zombie with the same hat color as the passed in zombie from
	 * the conga line!
	 */
	public void youAreDone(Zombie dancer) {
		ZombieHatColor color = dancer.getZombieHatColor();
		Node<Zombie> first = congaLine.getHead();
		int count = 0;
		while (first != null) {
			if (color == first.getValue().getZombieHatColor()) {
				congaLine.remove(count);
				break;
			}
			count++;
		}
	}

	/*
	 * Make two more zombies with the same hat color as the passed in zombie and add
	 * one to the front, one to the end and one in the middle.
	 */
	public void brains(Zombie dancer) {
		ZombieHatColor color = dancer.getZombieHatColor();
		Zombie inputF = new Zombie(color);
		Zombie inputS = new Zombie(color);

		Node<Zombie> currentHead = new Node(inputF);

		Node oldhead = congaLine.getHead();
		currentHead.setNext(oldhead);

		Node<Zombie> jumper = congaLine.getHead();
		for (int i = 0; i < congaLine.size() / 2; i++) {
			jumper.getNext();
		}
		jumper.setValue(dancer);

		Node<Zombie> currentTail = new Node(inputS);

		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);

	}

	/*
	 * Add the passed in zombie to the front and then add one zombie of each hat
	 * color to the end of the line.
	 */
	public void rainbowBrains(Zombie dancer) {
		
		Node first = congaLine.getHead();
		
		Node currentHead = new Node(dancer);
		currentHead.setNext(first);

		
		Zombie red = new Zombie(ZombieHatColor.R);
		Node<Zombie> currentTail = new Node(red);
		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);
		Zombie orange = new Zombie(ZombieHatColor.O);
		Node<Zombie> currentTail = new Node(red);
		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);
		Zombie yellow = new Zombie(ZombieHatColor.Y);
		Node<Zombie> currentTail = new Node(red);
		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);
		Zombie green = new Zombie(ZombieHatColor.G);
		Node<Zombie> currentTail = new Node(red);
		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);
		Zombie blue = new Zombie(ZombieHatColor.B);
		Node<Zombie> currentTail = new Node(red);
		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);
		Zombie indigo = new Zombie(ZombieHatColor.I);
		Node<Zombie> currentTail = new Node(red);
		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);
		Zombie violet = new Zombie(ZombieHatColor.V);
		Node<Zombie> currentTail = new Node(red);
		Node oldtail = congaLine.getTail();
		currentTail.setPrev(oldtail);

		
	}

	public LinkedList<Zombie> getCongaLine() {
		return congaLine;
	}
}
