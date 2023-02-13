{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red58\green62\blue70;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c29412\c30980\c34510;\csgray\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
import java.math.BigDecimal;\
import java.util.*;\
class Solution\{\
\
    public static void main(String []args)\{\
        //Input\
        Scanner sc= new Scanner(System.in);\
        int n=sc.nextInt();\
        String []s=new String[n+2];\
        for(int i=0;i<n;i++)\{\
            s[i]=sc.next();\
        \}\
          sc.close();\
\
        //Write your code here\
\
for(int i=0;i<n;i++)\
\{\
    //inserting string values to bigdecimal\
    BigDecimal First=new BigDecimal(s[i]);\
    int index=i;\
    for(int j=i+1;j<n;j++)\
    \{\
        //second BigDecimal to compare the first Bigdecimal\
        BigDecimal Second=new BigDecimal(s[j]);\
\
        //comparing if First element is greater that second element\
        //if the First element is greater than Second element than compareTo() returns 1\
\
        if(Second.compareTo(First)==1)\{\
            First=Second;\
            index=j;\
        \}\
    \}\
\
    //temporary variable to store s[i] value\
\
        String temp=s[i];\
        s[i]=s[index];\
        s[index]=temp;\
\}\
      \
        //Output\
        for(int i=0;i<n;i++)\
        \{\
            System.out.println(s[i]);\
        \}\
    \}\
\
\}}