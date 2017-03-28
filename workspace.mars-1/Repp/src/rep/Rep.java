package rep;

public class Rep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		package Element;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.HashMap;
		import java.util.HashSet;
		import java.util.List;
		import java.util.Map;
		import java.util.Set;
		public class Repeat {


			 public static void main(String[] args) {
			        String para = "i am here";
			        List < String >repList = new ArrayList < String > ();
			        repList = Arrays.asList(para.split(" "));
			        System.out.println(repList);
			        int size = repList.size();

			        int i = 0;
			        Map < String, Integer > duplicatCountMap = new HashMap < String, Integer > ();
			        for (int j = 0; size > j; j++) {
			            int count = 0;
			            for (i = 0; size > i; i++) {
			                if (repList.get(j).equals(repList.get(i))) {
			                    count++;
			                    duplicatCountMap.put(repList.get(j), count);
			                }

			            }

			        }
			        System.out.println(duplicatCountMap);
			        List < Integer > myCountList = new ArrayList <Integer > ();
			        Set < String > myValueSet = new HashSet <String > ();
			        for (Map.Entry < String, Integer > entry: duplicatCountMap.entrySet()) {
			            myCountList.add(entry.getValue());
			            myValueSet.add(entry.getKey());
			        }
			        System.out.println(myCountList);
			        System.out.println(myValueSet);
			    }

			}


	}

}
