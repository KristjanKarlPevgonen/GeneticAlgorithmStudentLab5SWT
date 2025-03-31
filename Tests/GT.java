import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GT {

	@Test(timeout = 4000)
	public void testNextGenerationThrowsTooManyResourcesException() throws Throwable {
	    Population population0 = new Population(860);
	    // Undeclared exception!
	    Algorithm.nextGeneration(population0);
	}

	@Test(timeout = 4000)
	public void testPrintBoardThrowsNullPointerException() throws Throwable {
	    ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	    arrayList0.add((Integer) null);
	    // Undeclared exception!
	    Algorithm.printBoard(arrayList0);
	}

	@Test(timeout = 4000)
	public void testCheckDiagonals() throws Throwable {
	    Individual individual0 = null;
	    int int0 = 4205;
	    // Undeclared exception!
	    Algorithm.checkDiagonals((Individual) null, 8, 4205);
	}

	@Test(timeout = 4000)
	public void testMutateIvThrowsIndexOutOfBoundsException() throws Throwable {
	    Individual individual0 = new Individual();
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    individual0.list = (List<Integer>) linkedList0;
	    // Undeclared exception!
	    Algorithm.mutateIv(individual0);
	}

	@Test(timeout = 4000)
	public void testPrintPopFitnessesThrowsTooManyResourcesException() throws Throwable {
	    int int0 = 1086;
	    Population population0 = new Population(1086);
	    ArrayList<Individual> arrayList0 = population0.individuals;
	    population0.individuals = arrayList0;
	    // Undeclared exception!
	    Algorithm.printPopFitnesses(population0);
	}

	@Test(timeout = 4000)
	public void testGenerationAndMutateIv() throws Throwable {
	    Population population0 = new Population();
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    population0.individuals = arrayList0;
	    ArrayList<Individual> arrayList1 = new ArrayList<Individual>();
	    Individual individual0 = new Individual();
	    population0.individuals.add(individual0);
	    Individual individual1 = Algorithm.mutateIv(individual0);
	    individual1.list = individual0.list;
	    individual1.list = individual0.list;
	    population0.individuals.clone();
	    individual1.list = individual0.list;
	    population0.individuals.add(individual0);
	    population0.individuals = arrayList1;
	    arrayList1.add(individual1);
	    population0.individuals = arrayList1;
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
	public void testRunAlgorithmThrowsStackOverflowError() throws Throwable {
	    Population population0 = new Population();
	    Population population1 = Algorithm.nextGeneration(population0);
	    population1.individuals = population0.individuals;
	    try {
	        Algorithm.runAlgorithm(population1);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testRunAlgorithmWithNonNull() throws Throwable {
	    Population population0 = new Population(0);
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
	public void testPrintPopFitnesses() throws Throwable {
	    Population population0 = new Population();
	    ArrayList<Individual> arrayList0 = population0.individuals;
	    population0.individuals = arrayList0;
	    Algorithm.printPopFitnesses(population0);
	}

	@Test(timeout = 4000)
	public void testGenerationWithNonNull() throws Throwable {
	    Population population0 = new Population();
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
	public void testPrintBoardWithEmptyList() throws Throwable {
	    ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	    Algorithm.printBoard(arrayList0);
	}

	@Test(timeout = 4000)
	public void testGetFitness() throws Throwable {
	    Individual individual0 = new Individual();
	    Algorithm.getFitness(individual0);
	    Population population0 = new Population();
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    population0.individuals = arrayList0;
	    population0.individuals.removeAll(individual0.list);
	    arrayList0.add(individual0);
	    population0.individuals = arrayList0;
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
	public void testNextGeneration() throws Throwable {
	    Population population0 = new Population(200);
	    ArrayList<Individual> arrayList0 = population0.individuals;
	    population0.individuals = arrayList0;
	    ArrayList<Individual> arrayList1 = new ArrayList<Individual>();
	    ArrayList<Individual> arrayList2 = population0.individuals;
	    population0.individuals = arrayList2;
	    population0.individuals = arrayList1;
	    Population population1 = Algorithm.nextGeneration(population0);
	    population1.individuals = population0.individuals;
	    Algorithm.nextGeneration(population1);
	    Individual individual0 = new Individual();
	    List.of(individual0, individual0, individual0, individual0, individual0, individual0, individual0, individual0, individual0);
	    Population population2 = Algorithm.nextGeneration(population1);
	    population0.individuals.iterator();
	    try {
	        Algorithm.generation(population2);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Didn't find solution in 1000 generations
	        //
	        // verifyException("Algorithm", e);
	    }
	}

	@Test(timeout = 4000)
	public void testGetFitnessThrowsIndexOutOfBoundsException() throws Throwable {
	    Individual individual0 = new Individual();
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    linkedList0.parallelStream();
	    individual0.list = (List<Integer>) linkedList0;
	    individual0.list = (List<Integer>) linkedList0;
	    List<Integer> list0 = individual0.list;
	    Algorithm.printBoard(list0);
	    // Undeclared exception!
	    Algorithm.getFitness(individual0);
	}

	@Test(timeout = 4000)
	public void testCreatesAlgorithm() throws Throwable {
	    Algorithm algorithm0 = new Algorithm();
	    Algorithm.counter = (-4036);
	    Individual individual0 = new Individual();
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    individual0.list = (List<Integer>) linkedList0;
	    ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	    individual0.list = (List<Integer>) arrayList0;
	    individual0.list = null;
	    linkedList0.add((Integer) null);
	    // Undeclared exception!
	    Algorithm.checkDiagonals(individual0, (-4036), 0);
	}

	@Test(timeout = 4000)
	public void testCheckDiagonalsWithNegative() throws Throwable {
	    ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	    arrayList0.iterator();
	    Algorithm.printBoard(arrayList0);
	    // Undeclared exception!
	    Algorithm.checkDiagonals((Individual) null, (-3162), (-3162));
	}

	@Test(timeout = 4000)
	public void testCheckDiagonalsThrowsNullPointerException() throws Throwable {
	    Algorithm algorithm0 = new Algorithm();
	    Algorithm.counter = (-4036);
	    Individual individual0 = new Individual();
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    individual0.list = (List<Integer>) linkedList0;
	    ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	    individual0.list = (List<Integer>) arrayList0;
	    individual0.list = null;
	    linkedList0.add((Integer) null);
	    // Undeclared exception!
	    Algorithm.checkDiagonals(individual0, (-4036), 0);
	}

	@Test(timeout = 4000)
	public void testRunAlgorithm() throws Throwable {
	    int int0 = (-2146);
	    Population population0 = new Population((-2146));
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    population0.individuals = arrayList0;
	    ArrayList<Individual> arrayList1 = population0.individuals;
	    population0.individuals = arrayList1;
	    Individual individual0 = new Individual();
	    population0.individuals.add(individual0);
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
	public void testRunAlgorithmThrowsIndexOutOfBoundsException() throws Throwable {
	    Population population0 = new Population();
	    ArrayList<Individual> arrayList0 = population0.individuals;
	    population0.individuals = arrayList0;
	    ArrayList<Individual> arrayList1 = new ArrayList<Individual>();
	    population0.individuals = arrayList1;
	    population0.individuals = arrayList1;
	    Population population1 = Algorithm.nextGeneration(population0);
	    population1.individuals = population0.individuals;
	    population1.individuals = population0.individuals;
	    Individual individual0 = new Individual();
	    ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
	    individual0.list = (List<Integer>) arrayList2;
	    population1.individuals.add(individual0);
	    arrayList0.add(individual0);
	    try {
	        Algorithm.runAlgorithm(population1);
	        fail("Expecting exception: IndexOutOfBoundsException");
	    } catch (IndexOutOfBoundsException e) {
	    }
	}

	@Test(timeout = 4000)
	public void testGenerationThrowsException() throws Throwable {
	    Population population0 = new Population((-697));
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    population0.individuals = arrayList0;
	    population0.individuals = arrayList0;
	    population0.individuals = arrayList0;
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
	public void testPrintBestFitness() throws Throwable {
	    Algorithm algorithm0 = new Algorithm();
	    Population population0 = new Population();
	    Population population1 = Algorithm.nextGeneration(population0);
	    Algorithm.printBestFitness(population1);
	}

	@Test(timeout = 4000)
	public void testCheckDiagonalsAndPrintFitness() throws Throwable {
	    Individual individual0 = new Individual();
	    Algorithm.checkDiagonals(individual0, (-1), 0);
	    Algorithm.printFitness(individual0);
	    Population population0 = new Population((-1));
	    Algorithm.printBestFitness(population0);
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    population0.individuals = arrayList0;
	    Algorithm.printBoard(individual0.list);
	    Algorithm.printBestFitness(population0);
	    Algorithm.mutateIv(individual0);
	}

	@Test(timeout = 4000)
	public void testMutateIv() throws Throwable {
	    Population population0 = new Population();
	    ArrayList<Individual> arrayList0 = new ArrayList<Individual>();
	    population0.individuals = arrayList0;
	    ArrayList<Individual> arrayList1 = new ArrayList<Individual>();
	    Individual individual0 = new Individual();
	    population0.individuals.add(individual0);
	    Individual individual1 = Algorithm.mutateIv(individual0);
	    individual1.list = individual0.list;
	    individual1.list = individual0.list;
	    population0.individuals.clone();
	    individual1.list = individual0.list;
	    population0.individuals.add(individual0);
	    population0.individuals = arrayList1;
	    arrayList1.add(individual1);
	    population0.individuals = arrayList1;
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
	public void testRunAlgorithmThrowsException() throws Throwable {
	    Population population0 = new Population((-30));
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
	    int int0 = (-3786);
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Integer integer0 = new Integer((-3786));
	    linkedList0.add(integer0);
	    individual0.list = (List<Integer>) linkedList0;
	    linkedList0.spliterator();
	    int int1 = 3290;
	    // Undeclared exception!
	    Algorithm.checkDiagonals(individual0, (-3786), 3290);
	}

	@Test(timeout = 4000)
	public void testPrintBestFitnessThrowsNullPointerException() throws Throwable {
	    Population population0 = null;
	    // Undeclared exception!
	    Algorithm.printBestFitness((Population) null);
	}

	@Test(timeout = 4000)
	public void testPrintBoard() throws Throwable {
	    Integer integer0 = new Integer(1000);
	    Integer integer1 = new Integer(8);
	    Integer integer2 = new Integer(1000);
	    List<Integer> list0 = List.of(integer0, integer0, integer1, integer2, integer1);
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>(list0);
	    Algorithm.printBoard(linkedList0);
	}

	@Test(timeout = 4000)
	public void testGenerationThrowsNullPointerException() throws Throwable {
	    Population population0 = new Population();
	    population0.individuals = null;
	    try {
	        Algorithm.generation(population0);
	        fail("Expecting exception: NullPointerException");
	    } catch (NullPointerException e) {
	        //
	        // no message in exception (getMessage() returned null)
	        //
	    }
	}

	@Test(timeout = 4000)
	public void testCheckDiagonalsReturningTrue() throws Throwable {
	    Individual individual0 = new Individual();
	    Boolean boolean0 = Algorithm.checkDiagonals(individual0, 0, 0);
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testPrintFitnessThrowsNullPointerException() throws Throwable {
	    Individual individual0 = null;
	    // Undeclared exception!
	    Algorithm.printFitness((Individual) null);
	}

}