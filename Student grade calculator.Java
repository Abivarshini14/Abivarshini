def calculate_grade(average_percentage):
    if average_percentage >= 90:
        return 'A'
    elif average_percentage >= 80:
        return 'B'
    elif average_percentage >= 70:
        return 'C'
    elif average_percentage >= 60:
        return 'D'
    else:
        return 'F'

def display_results(subjects, marks):
    total_marks = sum(marks)
    average_percentage = total_marks / len(marks)
    grade = calculate_grade(average_percentage)
    
    print("\nResults:")
    print(f"Subjects: {', '.join(subjects)}")
    print(f"Total Marks: {total_marks}")
    print(f"Average Percentage: {average_percentage:.2f}%")
    print(f"Grade: {grade}")

def main():
    subjects = []
    marks = []
    num_subjects = int(input("Enter the number of subjects: "))
    
    for _ in range(num_subjects):
        subject = input("Enter the subject name: ")
        subjects.append(subject)
        while True:
            try:
                mark = float(input(f"Enter marks obtained in {subject} (out of 100): "))
                if 0 <= mark <= 100:
                    marks.append(mark)
                    break
                else:
                    print("Please enter a number between 0 and 100.")
            except ValueError:
                print("Invalid input. Please enter a valid number.")
    
    display_results(subjects, marks)

if __name__ == "__main__":
    main()
