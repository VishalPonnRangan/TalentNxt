{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red144\green1\blue18;\red22\green107\blue41;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c63922\c8235\c8235;\cssrgb\c7451\c48627\c21176;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl460\partightenfactor0

\f0\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf4 \strokec4 \'a0java.util.*;\cb1 \
\cf2 \cb3 \strokec2 class\cf4 \strokec4 \'a0Solution\{\cb1 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0\cf2 \strokec2 boolean\cf4 \strokec4 \'a0isBallanced(String\'a0paranString)\cb1 \
\cb3 \'a0\'a0\'a0\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0List<String>closingParan\'a0=\'a0\'a0Arrays.asList(\cf5 \strokec5 "\}"\cf4 \strokec4 ,\'a0\cf5 \strokec5 ")"\cf4 \strokec4 ,\'a0\cf5 \strokec5 "]"\cf4 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 boolean\cf4 \strokec4 \'a0isBallanced\'a0=\'a0\cf2 \strokec2 true\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ArrayList<String>\'a0stack\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0ArrayList<String>();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (paranString.length()>\cf6 \strokec6 0\cf4 \strokec4 )\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4 \'a0i\'a0=\'a0\cf6 \strokec6 0\cf4 \strokec4 ;i<paranString.length();i++)\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String\'a0paran\'a0=\'a0paranString.substring(i,i+\cf6 \strokec6 1\cf4 \strokec4 );\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (stack.size()\'a0==\'a0\cf6 \strokec6 0\cf4 \strokec4 \'a0&&\'a0closingParan.contains(paran))\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0isBallanced=\cf2 \strokec2 false\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 break\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf4 \strokec4 \{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (paran.equals(\cf5 \strokec5 "\{"\cf4 \strokec4 )\'a0||\'a0paran.equals(\cf5 \strokec5 "("\cf4 \strokec4 )\'a0||\'a0paran.equals(\cf5 \strokec5 "["\cf4 \strokec4 ))\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0stack.add(paran);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf4 \strokec4 \{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String\'a0stackParan\'a0=\'a0stack.get(stack.size()-\cf6 \strokec6 1\cf4 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 ((stackParan.equals(\cf5 \strokec5 "\{"\cf4 \strokec4 )\'a0&&\'a0paran.equals(\cf5 \strokec5 "\}"\cf4 \strokec4 ))\'a0||\'a0(stackParan.equals(\cf5 \strokec5 "("\cf4 \strokec4 )\'a0&&\'a0paran.equals(\cf5 \strokec5 ")"\cf4 \strokec4 )\'a0||\'a0(stackParan.equals(\cf5 \strokec5 "["\cf4 \strokec4 )\'a0&&\'a0paran.equals(\cf5 \strokec5 "]"\cf4 \strokec4 ))))\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0stack.remove(stack.size()-\cf6 \strokec6 1\cf4 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf4 \strokec4 \{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0isBallanced\'a0=\'a0\cf2 \strokec2 false\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 break\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (stack.size()>\cf6 \strokec6 0\cf4 \strokec4 )\'a0isBallanced\'a0=\'a0\cf2 \strokec2 false\cf4 \strokec4 ;\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0isBallanced;\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0\cf2 \strokec2 void\cf4 \strokec4 \'a0main(String\'a0[]argh)\cb1 \
\cb3 \'a0\'a0\'a0\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Scanner\'a0sc\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0Scanner(System.in);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 while\cf4 \strokec4 \'a0(sc.hasNext())\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (isBallanced(sc.nextLine()))\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "true"\cf4 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf4 \strokec4 \{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "false"\cf4 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \}\cb1 \
\
\
\
\
}