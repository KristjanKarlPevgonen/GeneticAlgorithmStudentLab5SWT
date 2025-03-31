import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class zWTestsUuesti {

	@Test(timeout = 4000)
	public void testPrintBoardThrowsNullPointerException() throws Throwable {
	    List<Integer> list0 = null;
	    // Undeclared exception!
	    Algorithm.printBoard((List<Integer>) null);
	}

	@Test(timeout = 4000)
	public void testGenerationThrowsException() throws Throwable {
	    Population population0 = new Population(617);
	    assertNotNull(population0);
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    assertNotNull(arrayList0);
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    population0.individuals = arrayList0;
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    assertTrue(population0.individuals.isEmpty());
	    assertEquals(0, population0.individuals.size());
	    ArrayList<Individual> arrayList1 = null;
	    LinkedList<Object> linkedList0 = new LinkedList<Object>();
	    assertNotNull(linkedList0);
	    assertFalse(linkedList0.contains(617));
	    assertEquals(0, linkedList0.size());
	    Object object0 = new Object();
	    assertNotNull(object0);
	    boolean boolean0 = linkedList0.remove(object0);
	    assertFalse(boolean0);
	    assertFalse(linkedList0.contains(object0));
	    assertEquals(0, linkedList0.size());
	    ListIterator<Object> listIterator0 = linkedList0.listIterator();
	    assertNotNull(listIterator0);
	    assertFalse(linkedList0.contains(object0));
	    assertEquals(0, linkedList0.size());
	    assertFalse(listIterator0.hasNext());
	    assertFalse(listIterator0.hasPrevious());
	    boolean boolean1 = population0.individuals.remove(object0);
	    assertFalse(boolean1);
	    assertTrue(boolean1 == boolean0);
	    population0.individuals = arrayList0;
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    assertTrue(population0.individuals.isEmpty());
	    assertEquals(0, population0.individuals.size());
	    boolean boolean2 = population0.individuals.retainAll(linkedList0);
	    assertFalse(boolean2);
	    assertFalse(linkedList0.contains(object0));
	    assertTrue(boolean2 == boolean0);
	    assertTrue(boolean2 == boolean1);
	    assertEquals(0, linkedList0.size());
	    boolean boolean3 = arrayList0.containsAll(population0.individuals);
	    assertTrue(boolean3);
	    assertFalse(boolean3 == boolean0);
	    assertFalse(boolean3 == boolean2);
	    assertFalse(boolean3 == boolean1);
	    assertSame(population0.individuals, arrayList0);
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    assertTrue(population0.individuals.isEmpty());
	    assertEquals(0, population0.individuals.size());
	    try {
	        Algorithm.generation(population0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testPrintBestFitness() throws Throwable {
	    int int0 = 0;
	    Population population0 = new Population(0);
	    assertNotNull(population0);
	    Algorithm.printBestFitness(population0);
	    try {
	        Algorithm.generation(population0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testNextGenerationAndPrintPopFitnesses() throws Throwable {
	    Population population0 = new Population();
	    Population population1 = Algorithm.nextGeneration(population0);
	    Algorithm.printPopFitnesses(population1);
	    try {
	        Algorithm.generation(population1);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testNextGenerationWithNonNullAndRunAlgorithmWithNonNull() throws Throwable {
	    Algorithm algorithm0 = new Algorithm();
	    assertNotNull(algorithm0);
	    assertEquals(0, Algorithm.counter);
	    Population population0 = new Population();
	    assertNotNull(population0);
	    Population population1 = Algorithm.nextGeneration(population0);
	    assertNotNull(population1);
	    assertFalse(population1.equals((Object) population0));
	    assertNotSame(population0, population1);
	    assertNotSame(population1, population0);
	    Population population2 = new Population(0);
	    assertNotNull(population2);
	    assertFalse(population2.equals((Object) population1));
	    assertFalse(population2.equals((Object) population0));
	    ArrayList<Individual> arrayList0 = population1.individuals;
	    assertNotNull(arrayList0);
	    assertEquals(0, arrayList0.size());
	    assertTrue(arrayList0.isEmpty());
	    population0.individuals = arrayList0;
	    assertEquals(0, arrayList0.size());
	    assertTrue(arrayList0.isEmpty());
	    assertTrue(population0.individuals.isEmpty());
	    assertEquals(0, population0.individuals.size());
	    population2.individuals = population1.individuals;
	    assertEquals(0, population2.individuals.size());
	    assertTrue(population2.individuals.isEmpty());
	    try {
	        Algorithm.runAlgorithm(population2);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testNextGenerationWithNonNullAndPrintBestFitnessWithNonNull() throws Throwable {
	    Population population0 = new Population();
	    assertNotNull(population0);
	    Population population1 = Algorithm.nextGeneration(population0);
	    assertNotNull(population1);
	    assertFalse(population1.equals((Object) population0));
	    assertNotSame(population0, population1);
	    assertNotSame(population1, population0);
	    Algorithm.printBestFitness(population1);
	    assertFalse(population0.equals((Object) population1));
	    assertFalse(population1.equals((Object) population0));
	    assertNotSame(population0, population1);
	    assertNotSame(population1, population0);
	}

	@Test(timeout = 4000)
	public void testMutateIv() throws Throwable {
	    Individual individual0 = new Individual();
	    assertNotNull(individual0);
	    Individual individual1 = Algorithm.mutateIv(individual0);
	    assertNotNull(individual1);
	    assertSame(individual0, individual1);
	    assertSame(individual1, individual0);
	    individual1.list = individual0.list;
	    assertFalse(individual1.list.isEmpty());
	    assertEquals(8, individual1.list.size());
	    Boolean boolean0 = Algorithm.checkDiagonals(individual1, 1771, 1);
	    assertNotNull(boolean0);
	    assertTrue(boolean0);
	    assertSame(individual0, individual1);
	    assertSame(individual1, individual0);
	    Individual individual2 = Algorithm.mutateIv(individual0);
	    assertNotNull(individual2);
	    assertSame(individual0, individual1);
	    assertSame(individual0, individual2);
	    assertSame(individual2, individual1);
	    assertSame(individual2, individual0);
	    Algorithm algorithm0 = new Algorithm();
	    assertNotNull(algorithm0);
	    assertEquals(0, Algorithm.counter);
	    individual0.list = individual1.list;
	    assertFalse(individual1.list.isEmpty());
	    assertEquals(8, individual1.list.size());
	    assertFalse(individual0.list.isEmpty());
	    assertEquals(8, individual0.list.size());
	    Algorithm.counter = 1;
	    Population population0 = new Population();
	    assertNotNull(population0);
	    Population population1 = Algorithm.nextGeneration(population0);
	    assertNotNull(population1);
	    assertFalse(population1.equals((Object) population0));
	    assertNotSame(population0, population1);
	    assertNotSame(population1, population0);
	    population1.individuals = population0.individuals;
	    assertEquals(0, population1.individuals.size());
	    assertTrue(population1.individuals.isEmpty());
	    individual0.list = individual2.list;
	    assertFalse(individual1.list.isEmpty());
	    assertEquals(8, individual1.list.size());
	    assertFalse(individual0.list.isEmpty());
	    assertEquals(8, individual0.list.size());
	    try {
	        Algorithm.generation(population1);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testPrintFitnessThrowsIndexOutOfBoundsException() throws Throwable {
	    Individual individual0 = new Individual();
	    assertNotNull(individual0);
	    ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	    assertNotNull(arrayList0);
	    assertEquals(0, arrayList0.size());
	    assertTrue(arrayList0.isEmpty());
	    int int0 = 0;
	    Integer integer0 = new Integer(0);
	    assertNotNull(integer0);
	    assertEquals(0, (int) integer0);
	    assertTrue(integer0.equals((Object) int0));
	    LinkedList<Individual> linkedList0 = new LinkedList<Individual>();
	    assertNotNull(linkedList0);
	    assertFalse(linkedList0.contains(individual0));
	    assertEquals(0, linkedList0.size());
	    boolean boolean0 = linkedList0.removeLastOccurrence(individual0);
	    assertFalse(boolean0);
	    assertFalse(linkedList0.contains(individual0));
	    assertEquals(0, linkedList0.size());
	    List<LinkedList<Individual>> list0 = List.of(linkedList0, linkedList0, linkedList0, linkedList0);
	    assertNotNull(list0);
	    assertFalse(linkedList0.contains(individual0));
	    assertTrue(list0.contains(linkedList0));
	    assertEquals(0, linkedList0.size());
	    assertFalse(list0.isEmpty());
	    assertEquals(4, list0.size());
	    Integer integer1 = Integer.valueOf(0);
	    assertNotNull(integer1);
	    assertEquals(0, (int) integer1);
	    assertTrue(integer1.equals((Object) integer0));
	    List<Integer> list1 = List.of(integer0, integer1);
	    assertNotNull(list1);
	    assertTrue(list1.contains(int0));
	    assertTrue(integer0.equals((Object) int0));
	    assertTrue(integer0.equals((Object) integer1));
	    assertTrue(integer1.equals((Object) integer0));
	    assertFalse(list1.isEmpty());
	    assertEquals(2, list1.size());
	    individual0.list = list1;
	    assertFalse(list1.isEmpty());
	    assertEquals(2, list1.size());
	    assertEquals(2, individual0.list.size());
	    assertFalse(individual0.list.isEmpty());
	    Stream<Integer> stream0 = arrayList0.stream();
	    assertNotNull(stream0);
	    assertFalse(arrayList0.contains(int0));
	    assertEquals(0, arrayList0.size());
	    assertTrue(arrayList0.isEmpty());
	    individual0.list = (List<Integer>) arrayList0;
	    assertFalse(list1.isEmpty());
	    assertEquals(2, list1.size());
	    assertTrue(individual0.list.isEmpty());
	    assertEquals(0, individual0.list.size());
	    // Undeclared exception!
	    Algorithm.printFitness(individual0);
	}

	@Test(timeout = 4000)
	public void testRunAlgorithmThrowsStackOverflowError() throws Throwable {
	    Algorithm algorithm0 = new Algorithm();
	    assertNotNull(algorithm0);
	    assertEquals(0, Algorithm.counter);
	    Population population0 = new Population(0);
	    assertNotNull(population0);
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    assertNotNull(arrayList0);
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    population0.individuals = arrayList0;
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    assertEquals(0, population0.individuals.size());
	    assertTrue(population0.individuals.isEmpty());
	    try {
	        Algorithm.runAlgorithm(population0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testCheckDiagonalsThrowsIndexOutOfBoundsException() throws Throwable {
	    Individual individual0 = new Individual();
	    assertNotNull(individual0);
	    ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	    assertNotNull(arrayList0);
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    individual0.list = (List<Integer>) arrayList0;
	    assertTrue(arrayList0.isEmpty());
	    assertEquals(0, arrayList0.size());
	    assertEquals(0, individual0.list.size());
	    assertTrue(individual0.list.isEmpty());
	    Integer integer0 = new Integer(0);
	    assertNotNull(integer0);
	    assertEquals(0, (int) integer0);
	    boolean boolean0 = arrayList0.add(integer0);
	    assertTrue(boolean0);
	    assertTrue(arrayList0.contains(0));
	    assertEquals(1, arrayList0.size());
	    assertFalse(arrayList0.isEmpty());
	    ArrayList arrayList1 = (ArrayList) arrayList0.clone();
	    assertNotNull(arrayList1);
	    assertTrue(arrayList0.contains(0));
	    assertEquals(1, arrayList0.size());
	    assertFalse(arrayList0.isEmpty());
	    assertEquals(1, arrayList1.size());
	    assertFalse(arrayList1.isEmpty());
	    // Undeclared exception!
	    Algorithm.checkDiagonals(individual0, 0, 0);
	}

	@Test(timeout = 4000)
	public void testRunAlgorithmWithNonNull() throws Throwable {
	    Algorithm algorithm0 = new Algorithm();
	    assertNotNull(algorithm0);
	    assertEquals(0, Algorithm.counter);
	    Population population0 = new Population();
	    assertNotNull(population0);
	    Population population1 = Algorithm.nextGeneration(population0);
	    assertNotNull(population1);
	    assertFalse(population1.equals((Object) population0));
	    assertNotSame(population0, population1);
	    assertNotSame(population1, population0);
	    Population population2 = new Population(0);
	    assertNotNull(population2);
	    assertFalse(population2.equals((Object) population1));
	    assertFalse(population2.equals((Object) population0));
	    ArrayList<Individual> arrayList0 = population1.individuals;
	    assertNotNull(arrayList0);
	    assertEquals(0, arrayList0.size());
	    assertTrue(arrayList0.isEmpty());
	    population0.individuals = arrayList0;
	    assertEquals(0, arrayList0.size());
	    assertTrue(arrayList0.isEmpty());
	    assertTrue(population0.individuals.isEmpty());
	    assertEquals(0, population0.individuals.size());
	    population2.individuals = population1.individuals;
	    assertEquals(0, population2.individuals.size());
	    assertTrue(population2.individuals.isEmpty());
	    try {
	        Algorithm.runAlgorithm(population2);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testGenerationWithNonNull() throws Throwable {
	    Population population0 = new Population((-2754));
	    assertNotNull(population0);
	    try {
	        Algorithm.generation(population0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testPrintBestFitnessThrowsNullPointerException() throws Throwable {
	    // Undeclared exception!
	    Algorithm.printBestFitness((Population) null);
	}

	@Test(timeout = 4000)
	public void testGenerationThrowsNullPointerException() throws Throwable {
	    Algorithm algorithm0 = new Algorithm();
	    assertNotNull(algorithm0);
	    assertEquals(0, Algorithm.counter);
	    try {
	        Algorithm.generation((Population) null);
	        fail("Expecting exception: NullPointerException");
	    } catch (NullPointerException e) {
	        //
	        // no message in exception (getMessage() returned null)
	        //
	    }
	}

	@Test(timeout = 4000)
	public void testPrintBestFitnessWithNonNull() throws Throwable {
	    Population population0 = new Population();
	    assertNotNull(population0);
	    Population population1 = Algorithm.nextGeneration(population0);
	    assertNotNull(population1);
	    assertFalse(population1.equals((Object) population0));
	    assertNotSame(population0, population1);
	    assertNotSame(population1, population0);
	    Algorithm.printBestFitness(population1);
	    assertFalse(population0.equals((Object) population1));
	    assertFalse(population1.equals((Object) population0));
	    assertNotSame(population0, population1);
	    assertNotSame(population1, population0);
	}

	@Test(timeout = 4000)
	public void testGenerationThrowsStackOverflowError() throws Throwable {
	    int int0 = 0;
	    Population population0 = new Population(0);
	    assertNotNull(population0);
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    assertNotNull(arrayList0);
	    assertEquals(0, arrayList0.size());
	    assertTrue(arrayList0.isEmpty());
	    Individual individual0 = new Individual();
	    assertNotNull(individual0);
	    Integer integer0 = new Integer(0);
	    assertNotNull(integer0);
	    assertEquals(0, (int) integer0);
	    assertTrue(integer0.equals((Object) int0));
	    Integer integer1 = new Integer(1);
	    assertNotNull(integer1);
	    assertEquals(1, (int) integer1);
	    assertFalse(integer1.equals((Object) int0));
	    assertFalse(integer1.equals((Object) integer0));
	    List<Integer> list0 = List.of(integer0, integer1, integer1, integer0);
	    assertNotNull(list0);
	    assertTrue(list0.contains(int0));
	    assertFalse(integer0.equals((Object) integer1));
	    assertTrue(integer0.equals((Object) int0));
	    assertFalse(integer1.equals((Object) int0));
	    assertFalse(integer1.equals((Object) integer0));
	    assertFalse(list0.isEmpty());
	    assertEquals(4, list0.size());
	    individual0.list = list0;
	    assertFalse(list0.isEmpty());
	    assertEquals(4, list0.size());
	    assertFalse(individual0.list.isEmpty());
	    assertEquals(4, individual0.list.size());
	    Individual individual1 = new Individual();
	    assertNotNull(individual1);
	    assertFalse(individual1.equals((Object) individual0));
	    individual0.list = individual1.list;
	    assertFalse(list0.isEmpty());
	    assertEquals(4, list0.size());
	    assertFalse(individual0.list.isEmpty());
	    assertEquals(8, individual0.list.size());
	    individual1.list = individual0.list;
	    assertEquals(8, individual1.list.size());
	    assertFalse(individual1.list.isEmpty());
	    List<Integer> list1 = individual1.list;
	    assertNotNull(list1);
	    assertTrue(list1.contains(int0));
	    assertFalse(list1.equals((Object) list0));
	    assertFalse(list1.isEmpty());
	    assertEquals(8, list1.size());
	    individual0.list = list1;
	    assertFalse(list0.isEmpty());
	    assertEquals(4, list0.size());
	    assertFalse(individual0.list.isEmpty());
	    assertEquals(8, individual0.list.size());
	    boolean boolean0 = arrayList0.add(individual0);
	    assertTrue(boolean0);
	    assertFalse(arrayList0.contains(individual1));
	    assertTrue(arrayList0.contains(individual0));
	    assertFalse(individual0.equals((Object) individual1));
	    assertNotSame(individual0, individual1);
	    assertFalse(arrayList0.isEmpty());
	    assertEquals(1, arrayList0.size());
	    population0.individuals = arrayList0;
	    assertFalse(arrayList0.isEmpty());
	    assertEquals(1, arrayList0.size());
	    assertFalse(population0.individuals.isEmpty());
	    assertEquals(1, population0.individuals.size());
	    try {
	        Algorithm.generation(population0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testCheckDiagonalsThrowsNullPointerException() throws Throwable {
	    // Undeclared exception!
	    Algorithm.checkDiagonals((Individual) null, 200, (-349));
	}

}