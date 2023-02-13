{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red22\green107\blue41;\red109\green109\blue109;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c7451\c48627\c21176;\cssrgb\c50196\c50196\c50196;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl460\partightenfactor0

\f0\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf4 \strokec4 \'a0java.util.*;\cb1 \
\
\cf2 \cb3 \strokec2 class\cf4 \strokec4 \'a0Student\{\cb1 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 private\cf4 \strokec4 \'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0id;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 private\cf4 \strokec4 \'a0String\'a0fname;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 private\cf4 \strokec4 \'a0\cf2 \strokec2 double\cf4 \strokec4 \'a0cgpa;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0Student(\cf2 \strokec2 int\cf4 \strokec4 \'a0id,\'a0String\'a0fname,\'a0\cf2 \strokec2 double\cf4 \strokec4 \'a0cgpa)\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 super\cf4 \strokec4 ();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 this\cf4 \strokec4 .id\'a0=\'a0id;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 this\cf4 \strokec4 .fname\'a0=\'a0fname;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 this\cf4 \strokec4 .cgpa\'a0=\'a0cgpa;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0getId()\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0id;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0String\'a0getFname()\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0fname;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 double\cf4 \strokec4 \'a0getCgpa()\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0cgpa;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \}\cb1 \
\
\pard\pardeftab720\sl460\partightenfactor0
\cf5 \cb3 \strokec5 //Complete\'a0the\'a0code\cf4 \cb1 \strokec4 \
\pard\pardeftab720\sl460\partightenfactor0
\cf2 \cb3 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 class\cf4 \strokec4 \'a0Solution\cb1 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \cb3 \{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0\cf2 \strokec2 void\cf4 \strokec4 \'a0main(String[]\'a0args)\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Scanner\'a0in\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0Scanner(System.in);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0testCases\'a0=\'a0Integer.parseInt(in.nextLine());\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0List<Student>\'a0studentList\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0ArrayList<Student>();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 while\cf4 \strokec4 (testCases>\cf5 \strokec5 0\cf4 \strokec4 )\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0id\'a0=\'a0in.nextInt();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String\'a0fname\'a0=\'a0in.next();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 double\cf4 \strokec4 \'a0cgpa\'a0=\'a0in.nextDouble();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Student\'a0st\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0Student(id,\'a0fname,\'a0cgpa);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0studentList.add(st);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0testCases--;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0Collections.sort(studentList,\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0Comparator<Student>()\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf6 \strokec6 @Override\cf4 \cb1 \strokec4 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0compare(Student\'a0s1,\'a0Student\'a0s2)\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (s2.getCgpa()>s1.getCgpa())\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0\cf5 \strokec5 1\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf4 \strokec4 \'a0\cf2 \strokec2 if\cf4 \strokec4 (s2.getCgpa()<s1.getCgpa())\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0-\cf5 \strokec5 1\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0s1.getFname().compareTo(s2.getFname());\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\});\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (Student\'a0st:\'a0studentList)\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(st.getFname());\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \}\cb1 \
\
\
\
\
}