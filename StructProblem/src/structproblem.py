# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Lloyd"
__date__ = "$May 14, 2015 10:28:11 AM$"

class studentInfo:
    name = ''
    netid = 0
    gpa = 0
    
def getStudentInfo(studentList):
    netid = input("Net id of student to search for: ")
    for x in studentList:
        if netid == x.netid:
            print("Name: " + x.name)
            print ("ID: " + x.netid)
            print("GPA: %.2f" % x.gpa)
            
    

def main(argv=None):
    
    student1 = studentInfo()
    student1.name = "James"
    student1.netid = "jslf535345"
    student1.gpa = 4.0
    
    student2 = studentInfo()
    student2.name = "Garreth"
    student2.netid = "lj427297"
    student2.gpa = 3.3
    
    student3 = studentInfo()
    student3.name = "Jerry"
    student3.netid = "bb459078"
    student3.gpa = 2.2
    
    student4 = studentInfo()
    student4.name = "Jonathan"
    student4.netid = "we46536"
    student4.gpa = 3.4
    
    student5 = studentInfo()
    student5.name = "Joe"
    student5.netid = "mm5464"
    student5.gpa = 3.9
    
    someStudentList = [student1, student2, student3, student4, student5]
    
    getStudentInfo(someStudentList)
        

if __name__ == "__main__":
    main()
    exit()