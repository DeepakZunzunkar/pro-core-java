package com.dz.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream03_methods {

	public static void main(String[] args) {

//		filter
		testfilterMethod();

//		map
		testMapAndFlatMapMethod();

//		sorted
		testSortingAndMinMax();

		System.err.println("\n_________________________\n");
		String[] programmingLanguages = { "java", "python", "nodejs", "ruby" };

		String proLang = join(programmingLanguages);
		System.out.println(proLang);

		List<String> proLangList = split(proLang);
		System.out.println(proLangList);

		String name = "zukerbug";
		List<Character> splitToListOfChar = splitToListOfChar(name);
		System.out.println(splitToListOfChar);

		String[] programming_languages = new String[] { "language:java", "os:linux", "editor:emacs" };
		
		
		System.out.println(Arrays.asList(programming_languages));
		
//		Stream<String[]> strArr = Arrays.asList(programming_languages).stream().map(str-> str.split(":"));
//		strArr.forEach(ss->{
//			System.out.println(ss[0]+"<--->"+ss[1]);
//		});
		
		Map<String, String> items 
			= Arrays.asList(programming_languages)
				.stream()
				.map(str-> str.split(":"))
				.collect(Collectors.toMap(str->str[0],str->str[1] ));
		
		items.forEach((k,v)->{
			
			System.out.println(k+" --- "+v);
			
		});		
	}

	private static void testSortingAndMinMax() {

		System.err.println("\n__________Testing Sorting____________________________\n");
		List<String> strList = Arrays.asList("amit", "sumit", "manish", "amol", "nikhil", "akshay", "suraj", "pappu",
				"nitesh");
		List<Integer> intlist = Arrays.asList(24, 26, 35, 46, 9, 8, 45, 53, 95, 14);
		// Follow default natural sorting order
		String strStrm = strList.stream().sorted().collect(Collectors.joining(","));
		System.out.println("default natura sorting : " + strStrm);

		List<Integer> intstr = intlist.stream().sorted().collect(Collectors.toList());
		System.out.println("default natura sorting :" + intstr);

		// Customized sorting order
		String sortedStr = strList.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.joining(","));
		System.out.println(sortedStr);

//				min
		Integer min1 = intlist.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("min " + min1);

//				max
		Integer max1 = intlist.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("max :" + max1);

		System.err.println("__sorting end_________________\n");
	}

	private static List<Emp> getEmpList() {

		return Arrays.asList(new Emp(101, "smit", Arrays.asList("7620427072,7570158562")),
				new Emp(102, "suraj", Arrays.asList("9225612121,758945222")),
				new Emp(103, "manish", Arrays.asList("7620427071,997845123")),
				new Emp(104, "nikhil", Arrays.asList("7385615017,85956235")),
				new Emp(106, "sachin", Arrays.asList("9515456585,99807541")),
				new Emp(107, "amol", Arrays.asList("45126523,7584569652")),
				new Emp(108, "akshay", Arrays.asList("12315343,41313213")),
				new Emp(109, "pappu", Arrays.asList("12315343,41313213")),
				new Emp(110, "nitesh", Arrays.asList("8594265412,75845655235"))

		);
	}

	// map(function) --> it perform operation on each elements
//	   				   it doesn't return boolean , it return elements by evaluating functions after performing it's operations.
	private static void testMapAndFlatMapMethod() {

		System.err.println("\n____________Testing Map____________________________\n");
//		Ex:01
		Stream<Integer> nbrsStream = Stream.of(24, 26, 35, 46, 9, 8, 45, 53, 95, 14);
		List<Integer> newNbrs = nbrsStream.map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNbrs);

		Stream<String> uppercase = Stream.of("A", "B", "C", "D");
		Stream<String> lowercase = uppercase.map(ch -> ch.toLowerCase());

		System.out.println("transformed to lowercase --> " + lowercase.collect(Collectors.joining(",")));

		System.out.println("__Ex: 03__________");

//		 transforming data 
//		 list<Emp> convert List<String>
		List<Emp> empList = getEmpList();

//		 one to one mapping
		List<String> nameList = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(nameList);

		List<String> idlist = empList.stream().map(emp -> emp.getId()).map(i -> i.toString())
				.collect(Collectors.toList());
		System.out.println(idlist);

		// here data is in non flattered structure.
//		 one to many mapping  ,so we need to use here is flatMap()
		List<List<String>> mbNumbrs = empList.stream().map(emp -> emp.getMobileNumbers()).collect(Collectors.toList());
		System.out.println(mbNumbrs);

//		 flatter the data in single stream then mapping 
//		 flat map get input as stream of stream
		List<String> phones = empList.stream().flatMap(emp -> emp.getMobileNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phones);
		System.err.println("\n___map end__________________________\n");
	}

	// filter(predicate)
//		predicate (interface) --> boolean valued function.
//		e-> e>10
//	based on predicate filter will filter out values.
//	if predicate returns true then only elements can be filter else it skip the elements.
	private static void testfilterMethod() {

		System.err.println("_________________Testing Filter________________________");
//		Ex:01
//		System.err.println("_________________Ex: 01_______________________________________");
		Stream<String> nameStream = Stream.of("sachin", "amol", "manish", "ganu", "akshay", "rahul", "Amit", "krunal");

		Predicate<String> prd = str -> (str.startsWith("a") || str.startsWith("A"));

		List<String> newNames1 = nameStream.filter(prd).collect(Collectors.toList());
		System.out.println(newNames1);

		/*
		 * java.lang.IllegalStateException: stream has already been operated upon or
		 * closed
		 * 
		 * List<String> newNames2 = nameStream.filter(str->
		 * str.startsWith("a")).collect(Collectors.toList());
		 * System.out.println(newNames2);
		 */

//		 Ex:02

		/*
		 * Stream<String> stringStream = Stream.of("A", "B", "C", "D"); Optional<String>
		 * result1 = stringStream.findAny(); System.out.println(result1.get());
		 * Optional<String> result2 = stringStream.findFirst();
		 */

//		Supplier is based on a lambda expression that takes no input and returns a new Stream.
//		Invoking the functional method get() on the Supplier returns a freshly created Stream object, 
//		on which we can safely perform another Stream operation.

		System.err.println("_________________Ex: 02_______________________________________");
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("A", "B", "C", "D");
		Optional<String> result1 = streamSupplier.get().findAny();
		System.out.println(result1.get());
		Optional<String> result2 = streamSupplier.get().findFirst();
		System.out.println(result2.get());

		System.err.println("_________________Ex: 03_______________________________________");

		Supplier<Stream<String>> suplierStream1 = () -> Stream.of("sachin", "amol", "manish", "ganu", "akshay", "rahul",
				"Amit", "krunal");
//		Stream<String> nameStream1 = suplierStream1.get();
		List<String> newNames3 = suplierStream1.get().filter(prd).collect(Collectors.toList());
		System.out.println(newNames3);

		List<String> newNames4 = suplierStream1.get().filter(str -> str.startsWith("a")).collect(Collectors.toList());
		System.out.println(newNames4);

		System.err.println("___filter end__________________________");
	}

	public static String join(String[] arrayOfString) {
		return Arrays.asList(arrayOfString).stream()
				// .map(...)
				.collect(Collectors.joining(","));
	}

	public static String joinWithPrefixPostfix(String[] arrayOfString) {
		return Arrays.asList(arrayOfString).stream()
				// .map(...)
				.collect(Collectors.joining(",", "[", "]"));
	}

//	Splitting Strings With Stream API
	public static List<String> split(String str) {
		return Stream.of(str.split(",")).map(elem -> new String(elem)).collect(Collectors.toList());
	}

//	convert a String to a Character list 
	public static List<Character> splitToListOfChar(String str) {
		return str.chars().mapToObj(item -> (char) item).collect(Collectors.toList());
	}

//	string Array to Map With Stream API

//	public static Map<String, String> arrayToMap(String[] arrayOfString) {
//		
//		return Arrays.asList(arrayOfString).stream().map(str -> str.split(":"))
//				.collect(arrayToMap(str -> str[0], str -> str[1]));
//	}

}
