# beecrowd | 1436
# Brick Game

tests = int(input())

case_results = []

for i in range(tests):
    members_ages = input()
    members_ages = members_ages.split(' ')

    team_members = int(members_ages[0])
    ages = members_ages[1:]
    ages.sort()
    
    idx_middle_age = int(team_members / 2)
    middle_age = ages[idx_middle_age]

    case_results.append(middle_age)


for i in range(tests):
    print(f'Case {i + 1}: {case_results[i]}')