# beecrowd | 2963
# Buffoon

'''
Input:
- candidates (integer): number of N candidates.
- votes (list): a list of N integer number representing the number of votes for
each candidate.

Output:
- string: 'S' if Carlos is elected or 'N' otherwise.
'''

candidates = int(input())
votes = []
for _ in range(candidates):
    number_votes = int(input())
    votes.append(number_votes)

max_voted = max(votes)
if max_voted == votes[0]:
    print('S')
else:
    print('N')