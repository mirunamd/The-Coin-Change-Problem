# The-Coin-Change-Problem

You have  types of coins available in infinite quantities where the value of each coin is given in the array C = [c0, c1, c2, .., cm-1]. Can you determine the number of ways of making change for n units using the given types of coins? For example, if m = 4, and C = [8, 3, 1, 2], we can make change for n = 3 units in three ways: {1, 1, 1}, {1, 2}, and {3}.

Given n, m and C, print the number of ways to make change for  units using any number of coins having the values given in C.

**Input Format**

The first line contains two space-separated integers describing the respective values of n and m. 
The second line contains m space-separated integers describing the respective values of c0, c1, c2, .., cm-1 (the list of distinct coins available in infinite amounts).

**Constraints**

- 1 <= ci <= 50

- 1 <= n <= 250

- 1 <= m <= 50

- Each ci is guaranteed to be distinct.

**Hints**

- Solve overlapping subproblems using Dynamic Programming (DP):

You can solve this problem recursively but will not pass all the test cases without optimizing to eliminate the overlapping subproblems. Think of a way to store and reference previously computed solutions to avoid solving the same subproblem multiple times.

- Consider the degenerate cases: 
    - How many ways can you make change for  cents?
    - How many ways can you make change for  cents if you have no coins?

- If you're having trouble defining your solutions store, then think about it in terms of the base case .

- The answer may be larger than a -bit integer.

**Output Format**

Print a long integer denoting the number of ways we can get a sum of  from the given infinite supply of  types of coins.

**Sample Input 0**

> 4 3

> 1 2 3

**Sample Output 0**

> 4

**Explanation 0**

There are four ways to make change for n = 4 using coins with values given by C = [1, 2, 3]:

1. {1, 1, 1, 1}

2. {1, 1, 2}

3. {2, 2}

4. {1, 3}

Thus, we print 4 as our answer.

**Sample Input 1**

> 10 4
> 2 5 3 6

**Sample Output 1**

> 5

** Explanation 1**

There are five ways to make change for  units using coins with values given by C = {2, 3, 5, 6}:

1. {2, 2, 2, 2, 2}

2. {2, 2, 3, 3}

3. {2, 2, 6}

4. {2, 3, 5}

5. {5, 5}


Thus, we print  as our answer.

https://www.hackerrank.com/contests/programming-interview-questions/challenges/coin-change
