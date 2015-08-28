public class Executor {

	public static void main(String[] args) {
		Utility.init(); // initializes file readers
		String[] questions = Utility.readQuestions(); //reads question.txt file into questions array
		String[] answers = Utility.readAnswers(); // reads answers.txt file into answers array
		
		int numOracles = answers.length; //finds the number of oracles
		
		//TODO Assign questions to oracles using Utility.random and print the question paired with the oracle response

		// 1. Initialize one ArrayQueue per oracle (arrays will work best).
		ArrayQueue[] oracles = new ArrayQueue[numOracles];
		for (int i = 0; i < numOracles; i++) {
			oracles[i] = new ArrayQueue();
		}
		// 2. Put the questions into the queues, assigning each one to the queue of the oracle whose number is returned by the random number generator.
		for (int i = 0; i < questions.length; i++) {
			oracles[Utility.random(numOracles - 1)].enqueue(questions[i]);
		}
		// 3. Loop through the oracles, having each one remove a question from its queue (if empty do nothing) and answer it with its unique answer (oracle[k] uses answers[k]). Do this repeatedly till all queues become empty.
		int count = questions.length;
		int index = 0;
		while (count > 0) {
			if (!oracles[index].isEmpty()) {
				System.out.println(oracles[index].dequeue());
				System.out.println(answers[index]);
				count--;
			}
			
			index++;
			if (index > numOracles - 1) {
				index = 0;
			}
			
		}
		
		// 4. Repeat steps 1-3, this time using your ListQueue instead (Please include some sort of divider between the first set of answers and the second set of answers - extra empty lines, a line of stars, etc.)

		// 1. Initialize one ListQueue per oracle (arrays will work best).
		ListQueue[] oracleLists = new ListQueue[numOracles];
		for (int i = 0; i < numOracles; i++) {
			oracleLists[i] = new ListQueue();
		}
		
		// 2. Put the questions into the queues, assigning each one to the queue of the oracle whose number is returned by the random number generator.
		for (int i = 0; i < questions.length; i++) {
			oracleLists[Utility.random(numOracles - 1)].enqueue(questions[i]);
		}
		
		// 3. Loop through the oracles, having each one remove a question from its queue (if empty do nothing) and answer it with its unique answer (oracle[k] uses answers[k]). Do this repeatedly till all queues become empty.
		int countL = questions.length;
		int indexL = 0;
		while (countL > 0) {
			if (!oracleLists[indexL].isEmpty()) {
				System.out.println(oracleLists[indexL].dequeue());
				System.out.println(answers[indexL]);
				countL--;
			}
			
			indexL++;
			if (indexL > numOracles - 1) {
				indexL = 0;
			}
			
		}
		
	}
}

