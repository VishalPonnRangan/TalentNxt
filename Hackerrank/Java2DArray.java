{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red0\green0\blue0;\red0\green0\blue0;
\red22\green107\blue41;\red144\green1\blue18;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\csgray\c0\c0;\cssrgb\c0\c0\c0;
\cssrgb\c7451\c48627\c21176;\cssrgb\c63922\c8235\c8235;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl460\partightenfactor0

\f0\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf4 \strokec4 \'a0java.io.*;\
\cf2 \strokec2 import\cf4 \strokec4 \'a0java.math.*;\
\cf2 \strokec2 import\cf4 \strokec4 \'a0java.security.*;\
\cf2 \strokec2 import\cf4 \strokec4 \'a0java.text.*;\
\cf2 \strokec2 import\cf4 \strokec4 \'a0java.util.*;\
\cf2 \strokec2 import\cf4 \strokec4 \'a0java.util.concurrent.*;\
\cf2 \strokec2 import\cf4 \strokec4 \'a0java.util.regex.*;\
\
\
\
\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 class\cf4 \strokec4 \'a0Solution\'a0\{\
\'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0\cf2 \strokec2 void\cf4 \strokec4 \'a0main(String[]\'a0args)\'a0\cf2 \strokec2 throws\cf4 \strokec4 \'a0IOException\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Scanner\'a0sc\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0Scanner(System.in);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String[][]\'a0numArray\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0String[\cf5 \strokec5 6\cf4 \strokec4 ][];\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0largestSum\'a0=\'a0\cf5 \strokec5 0\cf4 \strokec4 ;\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4 \'a0i=\cf5 \strokec5 0\cf4 \strokec4 ;\'a0i<\cf5 \strokec5 6\cf4 \strokec4 ;\'a0i++)\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0numArray[i]=sc.nextLine().split(\cf6 \strokec6 "\'a0"\cf4 \strokec4 );\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4 \'a0i=\cf5 \strokec5 0\cf4 \strokec4 ;i<=\cf5 \strokec5 3\cf4 \strokec4 ;i++)\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4 \'a0j=\cf5 \strokec5 0\cf4 \strokec4 ;j<=\cf5 \strokec5 3\cf4 \strokec4 ;j++)\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0sum\'a0=\'a0Integer.parseInt(numArray[i][j])+Integer.parseInt(numArray[i][j+\cf5 \strokec5 1\cf4 \strokec4 ])+Integer.parseInt(numArray[i][j+\cf5 \strokec5 2\cf4 \strokec4 ])+Integer.parseInt(numArray[i+\cf5 \strokec5 1\cf4 \strokec4 ][j+\cf5 \strokec5 1\cf4 \strokec4 ])+Integer.parseInt(numArray[i+\cf5 \strokec5 2\cf4 \strokec4 ][j])+Integer.parseInt(numArray[i+\cf5 \strokec5 2\cf4 \strokec4 ][j+\cf5 \strokec5 1\cf4 \strokec4 ])+Integer.parseInt(numArray[i+\cf5 \strokec5 2\cf4 \strokec4 ][j+\cf5 \strokec5 2\cf4 \strokec4 ]);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (i==\cf5 \strokec5 0\cf4 \strokec4 \'a0&&\'a0j==\cf5 \strokec5 0\cf4 \strokec4 )\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0largestSum=sum;\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf4 \strokec4 \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (sum>largestSum)\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0largestSum=sum;\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(largestSum);\
\'a0\'a0\'a0\'a0\}\
\}\
\
}