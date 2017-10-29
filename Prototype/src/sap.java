
public class sap
{

}
/*student_wa-studentid = '000001'.
student_wa-studentname = 'Jonny Carrera'.
student_wa-dateofbirth = '08-09-1986'.
student_wa-country = 'Norway'.
student_wa-courseid = '
INSERT student_wa INTO TABLE student_tab.

student_wa-studentid = '000002'.
student_wa-studentname = 'Jon Jonny'.
student_wa-dateofbirth = '22-09-1995'.
student_wa-country = 'Denamrk'.
INSERT student_wa INTO TABLE student_tab.

student_wa-studentid = '000003'.
student_wa-studentname = 'Mark Antonious'.
student_wa-dateofbirth = '01-03-1999'.
student_wa-country = 'Rusia'.
INSERT student_wa INTO TABLE student_tab.

student_wa-studentid = '000004'.
student_wa-studentname = 'Liudvikas Liuba'.
student_wa-dateofbirth = '01-01-1999'.
student_wa-country = 'Lithuania'.
INSERT student_wa INTO TABLE student_tab.

student_wa-studentid = '000005'.
student_wa-studentname = 'Alexander Barowsi'.
student_wa-dateofbirth = '03-12-1994'.
student_wa-country = 'Denmark'.
INSERT student_wa INTO TABLE student_tab.

student_wa-studentid = '000006'.
student_wa-studentname = 'Adam Georgi'.
student_wa-dateofbirth = '08-09-1986'.
student_wa-country = 'Norway'.
INSERT student_wa INTO TABLE student_tab.

student_wa-studentid = '000007'.
student_wa-studentname = 'Mitko Bartos'.
student_wa-dateofbirth = '04-04-1998'.
student_wa-country = 'Bulgaria'.
INSERT student_wa INTO TABLE student_tab.

student_wa-studentid = '000008'.
student_wa-studentname = 'Andreea Alexandra'.
student_wa-dateofbirth = '16-03-1993'.
student_wa-country = 'Norway'.
INSERT student_wa INTO TABLE student_tab.

TRY.
    DELETE FROM zstudent.
    INSERT zstudent
            FROM TABLE student_tab.

    IF sy-subrc = 0.

      MESSAGE 'Salesperson table updated'
              TYPE 'I'.

    ENDIF.

  CATCH cx_sy_open_sql_db.

    MESSAGE 'Salesperson table could not be updated'
     TYPE 'I' DISPLAY LIKE 'E'.
ENDTRY.


course_wa-courseid = '100'.
course_wa-STUDENTID = '000001'.
course_wa-teacherid = '250'.
course_wa-coursename = 'SkyModul1'.
course_wa-price = '500 EURO'.

course_wa-courseid = '100'.
course_wa-STUDENTID = '000001'.
course_wa-teacherid = '250'.
course_wa-coursename = 'SkyModul1'.
course_wa-price = '500 EURO'.

course_wa-courseid = '100'.
course_wa-STUDENTID = '000001'.
course_wa-teacherid = '250'.
course_wa-coursename = 'SkyModul1'.
course_wa-price = '500 EURO'.
course_wa-price = '500 EURO'. 


DATA : student_wa TYPE zstudent,
      student_tab TYPE HASHED TABLE OF zstudent
      WITH UNIQUE KEY studentid.

DATA : course_wa TYPE zcourse,
      course_tab TYPE HASHED TABLE OF zcourse
      WITH UNIQUE Key courseid.
*/ 

