public class arrayFns {
	arrayFns() {
		System.out.println("Array Functions Class by Akhilesh Wagh Started");
	}

	arrayFns(int x) {
	}

	public int[] append(int[] preary, int obj) {
		int l = preary.length;
		int retary[] = new int[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public char[] append(char[] preary, char obj) {
		int l = preary.length;
		char retary[] = new char[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public String[] append(String[] preary, String obj) {
		int l = preary.length;
		String retary[] = new String[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public float[] append(float[] preary, float obj) {
		int l = preary.length;
		float retary[] = new float[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public double[] append(double[] preary, double obj) {
		int l = preary.length;
		double retary[] = new double[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public boolean[] append(boolean[] preary, boolean obj) {
		int l = preary.length;
		boolean retary[] = new boolean[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public long[] append(long[] preary, long obj) {
		int l = preary.length;
		long retary[] = new long[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public short[] append(short[] preary, short obj) {
		int l = preary.length;
		short retary[] = new short[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public byte[] append(byte[] preary, byte obj) {
		int l = preary.length;
		byte retary[] = new byte[l + 1];
		for (int x = 0; x < l; x++) {
			retary[x] = preary[x];
		}
		retary[l] = obj;
		return retary;
	}

	public String aryToStr(int[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(short[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(double[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(float[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(boolean[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(long[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(String[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(byte[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	}

	public String aryToStr(char[] ary, String ch) {
		String fnl = "";
		boolean idThere = false;
		if (ch.indexOf("<id>") != -1) {
			idThere = true;
		}
		for (int x = 0; x < (ary.length - 1); x++) {
			fnl += ary[x] + ch;
			if (idThere) {
				fnl = fnl.replace("<id>", String.valueOf(x + 2));
			}
		}
		fnl += ary[ary.length - 1];
		return fnl;
	};

	public int[] sortAscending(int[] ary) {
		int l = ary.length;
		int tmp = 0;
		int mini = 0;
		for (int a = 0; a < l; a++) {
			mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b] < ary[mini]) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public boolean[] sortAscending(boolean[] ary) {
		arrayFns ob = new arrayFns(1);
		int t = ob.occurence(ary, true);
		int x;
		for (x = 0; x < t; x++) {
			ary[x] = true;
		}
		for (int y = x; y < ary.length; y++) {
			ary[y] = false;
		}
		return ary;
	}

	public short[] sortAscending(short[] ary) {
		int l = ary.length;
		short tmp;
		for (int a = 0; a < l; a++) {
			int mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b] < ary[mini]) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public byte[] sortAscending(byte[] ary) {
		int l = ary.length;
		byte tmp;
		for (int a = 0; a < l; a++) {
			int mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b] < ary[mini]) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public long[] sortAscending(long[] ary) {
		int l = ary.length;
		long tmp;
		for (int a = 0; a < l; a++) {
			int mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b] < ary[mini]) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public float[] sortAscending(float[] ary) {
		int l = ary.length;
		float tmp;
		for (int a = 0; a < l; a++) {
			int mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b] < ary[mini]) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public double[] sortAscending(double[] ary) {
		int l = ary.length;
		double tmp;
		for (int a = 0; a < l; a++) {
			int mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b] < ary[mini]) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public char[] sortAscending(char[] ary) {
		int l = ary.length;
		char tmp;
		for (int a = 0; a < l; a++) {
			int mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b] < ary[mini]) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public String[] sortAscending(String[] ary) {
		int l = ary.length;
		String tmp;
		System.out.print("inside the fn\n");
		for (int a = 0; a < l; a++) {
			int mini = a;
			for (int b = a + 1; b < l; b++) {
				if (ary[b].compareTo(ary[mini]) < 0) {
					mini = b;
				}
			}
			tmp = ary[a];
			ary[a] = ary[mini];
			ary[mini] = tmp;
		}
		return ary;
	}

	public int occurence(int[] ary, int n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(byte[] ary, byte n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(short[] ary, short n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(long[] ary, long n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(float[] ary, float n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(double[] ary, double n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(boolean[] ary, boolean n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(char[] ary, char n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x] == n) {
				oc++;
			}
		}
		return oc;
	}

	public int occurence(String[] ary, String n) {
		int l = ary.length;
		int oc = 0;
		for (int x = 0; x < l; x++) {
			if (ary[x].equals(n)) {
				oc++;
			}
		}
		return oc;
	}

	public byte[] aryRev(byte[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		byte[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public short[] aryRev(short[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		short[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public int[] aryRev(int[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		int[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public long[] aryRev(long[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		long[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public float[] aryRev(float[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		float[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public double[] aryRev(double[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		double[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public boolean[] aryRev(boolean[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		boolean[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public char[] aryRev(char[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		char[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public String[] aryRev(String[] ary) {
		int l = ary.length;
		arrayFns ob = new arrayFns(1);
		String[] ret = {};
		for (int x = (l - 1); x >= 0; x--) {
			ret = ob.append(ret, ary[x]);
		}
		return ret;
	}

	public int[] sortDescending(int[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public byte[] sortDescending(byte[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public short[] sortDescending(short[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public long[] sortDescending(long[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public float[] sortDescending(float[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public double[] sortDescending(double[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public boolean[] sortDescending(boolean[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public char[] sortDescending(char[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public String[] sortDescending(String[] ary) {
		arrayFns ob = new arrayFns(1);
		return (ob.aryRev(ob.sortAscending(ary)));
	}

	public int indexOf(byte[] ary, byte ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(short[] ary, short ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(int[] ary, int ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(long[] ary, long ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(float[] ary, float ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(double[] ary, double ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(boolean[] ary, boolean ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(char[] ary, char ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x] == ob) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int indexOf(String[] ary, String ob) {
		int l = ary.length;
		int a = -1;
		for (int x = 0; x < l; x++) {
			if (ary[x].equals(ob)) {
				a = x;
				return a;
			}
		}
		return a;
	}

	public int lastIndexOf(byte[] ary, byte ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(short[] ary, short ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(int[] ary, int ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(long[] ary, long ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(float[] ary, float ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(double[] ary, double ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(boolean[] ary, boolean ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(char[] ary, char ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x] == ob) {
				return x;
			}
		}
		return a;
	}

	public int lastIndexOf(String[] ary, String ob) {
		int l = ary.length;
		int a = -1;
		for (int x = (l - 1); x >= 0; x--) {
			if (ary[x].equals(ob)) {
				return x;
			}
		}
		return a;
	}

	public byte[] concat(byte[] ary1, byte[] ary2) {
		byte retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public short[] concat(short[] ary1, short[] ary2) {
		short retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public int[] concat(int[] ary1, int[] ary2) {
		int retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public long[] concat(long[] ary1, long[] ary2) {
		long retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public float[] concat(float[] ary1, float[] ary2) {
		float retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public double[] concat(double[] ary1, double[] ary2) {
		double retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public char[] concat(char[] ary1, char[] ary2) {
		char retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public boolean[] concat(boolean[] ary1, boolean[] ary2) {
		boolean retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public String[] concat(String[] ary1, String[] ary2) {
		String retary[] = {};
		int l1 = ary1.length;
		int l2 = ary2.length;
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < l1; x++) {
			retary = ob.append(retary, ary1[x]);
		}
		for (int y = 0; y < l2; y++) {
			retary = ob.append(retary, ary2[y]);
		}
		return retary;
	}

	public byte[] remDubli(byte[] ary) {
		byte retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(ary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public short[] remDubli(short[] ary) {
		short retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public int[] remDubli(int[] ary) {
		int retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public long[] remDubli(long[] ary) {
		long retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public float[] remDubli(float[] ary) {
		float retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public double[] remDubli(double[] ary) {
		double retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public boolean[] remDubli(boolean[] ary) {
		boolean retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public char[] remDubli(char[] ary) {
		char retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public String[] remDubli(String[] ary) {
		String retary[] = {};
		arrayFns ob = new arrayFns(1);
		for (int x = 0; x < ary.length; x++) {
			if (ob.indexOf(retary, ary[x]) == -1) {
				retary = ob.append(retary, ary[x]);
			}
		}
		return retary;
	}

	public static void main(String[] args) {
		System.out.println("This is a Java Class designed by Akhilesh Wagh which includes array functions");
		System.out.println("Copy the arrayFns.java file and paste it into your project folder");
		System.out.println(
				"\nTo use the functions of this class just initialise the object using the statement:\narrayFns ob = new arrayFns();");
		System.out.println("\nThe class has following Functions: ");
		System.out.println(
				"\n1) append\n\tIt appends an object or an item to the given array.\n\tIt returns the array of same datatype.\n\tThe parameters are: array, object\n\tUsage: String new[] = ob.append(StringArray, \"hello\");");

		System.out
				.println("\n2) aryToStr\n\tIt Converts the given array into string.\n\tThe return datatype is String");
		System.out.println(
				"\tThe parameters are: array, StringSeprator(here the seprator is added between the objects to seprate them).\n\tUsage: String output = ob.aryToStr(array, \"\\n\");");
		System.out.println("\tNote: The substring '<id>' will be replaced by the IndexOfTheObject+2");

		System.out.println(
				"\n3) indexOf\n\tThis method returns the index number of the object in the given array. It returns -1 if the object is not found in the array.");
		System.out.println(
				"\tThe return DataType is int.\n\tThe parameters are: array, object\n\tUsage: int index = ob.indexOf(array, 2);");

		System.out.println(
				"\n4) concat\n\tThis Method combines two arrays of same dataType.\n\tThe return DataType is same as Parameter's datatype");
		System.out.println("\tThe parameters are: array1, array2.\n\tUsage: int[] combined = ob.concat(ary1, ary2);");

		System.out.println("\n5) occurence\n\tThis method returns how many times an object has appread in the array.");
		System.out.println(
				"\tThe rerurn datatyoe is int.\n\tThe parameters are: array, object\n\tUsage: int occOfa = ob.occurence(charArray, 'a');");

		System.out.println(
				"\n6) sortAscending\n\tThis method arranges the items in the array in ascending order.\n\tThe return datatype is same as the parameter's datatype.");
		System.out.println("\tThe Parameters are: array\n\tUsage: int sortedAry[] = ob.sortAscending(intAry)");

		System.out.println(
				"\n7) sortDescending\n\tThis method arranges the items in the array in descending order.\n\tThe return datatype is same as the parameter's datatype.");
		System.out.println("\tThe Parameters are: array\n\tUsage: int sortedAry[] = ob.sortDescending(intAry)");
	}
}
