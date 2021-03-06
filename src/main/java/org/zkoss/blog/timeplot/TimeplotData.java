package org.zkoss.blog.timeplot;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeplotData {
	static final Object[][] events = {
		{getDate(1849, 1, 1), "California Gold Rush"},
		{getDate(1861, 4, 12), getDate(1865, 4, 9), "American Civil War"},
		{getDate(1882, 8, 3), "Immigration Act of 1882"},
		{getDate(1898, 4, 25), "Spanish-American War"},
		{getDate(1914, 7, 28), getDate(1918, 11, 11), "World War I"},
		{getDate(1924, 1, 1), "Immigration Act of 1924"},
		{getDate(1929, 10, 29), "Black Tuesday"},
		{getDate(1933, 1, 1), getDate(1938, 1, 1), "New Deal"},
		{getDate(1939, 9, 1), getDate(1945, 9, 2), "World War II"},
		{getDate(1950, 6, 25), getDate(1953, 9, 2), "Korean War"},
		{getDate(1964, 8, 2), getDate(1975, 4, 30), "Vietnam War"},
		{getDate(1969, 7, 21), "Man on the Moon"},
		{getDate(1980, 1, 1), "Refugee Act"},
		{getDate(1986, 11, 6), "Immigration Reform and Control Act of 1986"},
		{getDate(1990, 11, 29), "Immigration Act of 1990"},
		{getDate(1996, 9, 30), "Illegal Immigration Reform and Immigrant Responsibility Act of 1996"},
		{getDate(2001, 9, 11), "Attack at the World Trade Center"}
	};
	static final Double[][] data = {{getDate(1820, 1, 1), 8385d},
		{getDate(1821, 1, 1), 9127d},
		{getDate(1822, 1, 1), 6911d},
		{getDate(1823, 1, 1), 6354d},
		{getDate(1824, 1, 1), 7912d},
		{getDate(1825, 1, 1), 10199d},
		{getDate(1826, 1, 1), 10837d},
		{getDate(1827, 1, 1), 18875d},
		{getDate(1828, 1, 1), 27382d},
		{getDate(1829, 1, 1), 22520d},
		{getDate(1830, 1, 1), 23322d},
		{getDate(1831, 1, 1), 22633d},
		{getDate(1832, 1, 1), 60482d},
		{getDate(1833, 1, 1), 58640d},
		{getDate(1834, 1, 1), 65365d},
		{getDate(1835, 1, 1), 45374d},
		{getDate(1836, 1, 1), 76242d},
		{getDate(1837, 1, 1), 79340d},
		{getDate(1838, 1, 1), 38914d},
		{getDate(1839, 1, 1), 68069d},
		{getDate(1840, 1, 1), 84066d},
		{getDate(1841, 1, 1), 80289d},
		{getDate(1842, 1, 1), 104565d},
		{getDate(1843, 1, 1), 52496d},
		{getDate(1844, 1, 1), 78615d},
		{getDate(1845, 1, 1), 114371d},
		{getDate(1846, 1, 1), 154416d},
		{getDate(1847, 1, 1), 234968d},
		{getDate(1848, 1, 1), 226527d},
		{getDate(1849, 1, 1), 297024d},
		{getDate(1850, 1, 1), 369980d},
		{getDate(1851, 1, 1), 379466d},
		{getDate(1852, 1, 1), 371603d},
		{getDate(1853, 1, 1), 368645d},
		{getDate(1854, 1, 1), 427833d},
		{getDate(1855, 1, 1), 200877d},
		{getDate(1856, 1, 1), 200436d},
		{getDate(1857, 1, 1), 251306d},
		{getDate(1858, 1, 1), 123126d},
		{getDate(1859, 1, 1), 121282d},
		{getDate(1860, 1, 1), 153640d},
		{getDate(1861, 1, 1), 91918d},
		{getDate(1862, 1, 1), 91985d},
		{getDate(1863, 1, 1), 176282d},
		{getDate(1864, 1, 1), 193418d},
		{getDate(1865, 1, 1), 248120d},
		{getDate(1866, 1, 1), 318568d},
		{getDate(1867, 1, 1), 315722d},
		{getDate(1868, 1, 1), 138840d},
		{getDate(1869, 1, 1), 352768d},
		{getDate(1870, 1, 1), 387203d},
		{getDate(1871, 1, 1), 321350d},
		{getDate(1872, 1, 1), 404806d},
		{getDate(1873, 1, 1), 459803d},
		{getDate(1874, 1, 1), 313339d},
		{getDate(1875, 1, 1), 227498d},
		{getDate(1876, 1, 1), 169986d},
		{getDate(1877, 1, 1), 141857d},
		{getDate(1878, 1, 1), 138469d},
		{getDate(1879, 1, 1), 177826d},
		{getDate(1880, 1, 1), 457257d},
		{getDate(1881, 1, 1), 669431d},
		{getDate(1882, 1, 1), 788992d},
		{getDate(1883, 1, 1), 603322d},
		{getDate(1884, 1, 1), 518592d},
		{getDate(1885, 1, 1), 395346d},
		{getDate(1886, 1, 1), 334203d},
		{getDate(1887, 1, 1), 490109d},
		{getDate(1888, 1, 1), 546889d},
		{getDate(1889, 1, 1), 444427d},
		{getDate(1890, 1, 1), 455302d},
		{getDate(1891, 1, 1), 560319d},
		{getDate(1892, 1, 1), 579663d},
		{getDate(1893, 1, 1), 439730d},
		{getDate(1894, 1, 1), 285631d},
		{getDate(1895, 1, 1), 258536d},
		{getDate(1896, 1, 1), 343267d},
		{getDate(1897, 1, 1), 230832d},
		{getDate(1898, 1, 1), 229299d},
		{getDate(1899, 1, 1), 311715d},
		{getDate(1900, 1, 1), 448572d},
		{getDate(1901, 1, 1), 487918d},
		{getDate(1902, 1, 1), 648743d},
		{getDate(1903, 1, 1), 857046d},
		{getDate(1904, 1, 1), 812870d},
		{getDate(1905, 1, 1), 1026499d},
		{getDate(1906, 1, 1), 1100735d},
		{getDate(1907, 1, 1), 1285349d},
		{getDate(1908, 1, 1), 782870d},
		{getDate(1909, 1, 1), 751786d},
		{getDate(1910, 1, 1), 1041570d},
		{getDate(1911, 1, 1), 878587d},
		{getDate(1912, 1, 1), 838172d},
		{getDate(1913, 1, 1), 1197892d},
		{getDate(1914, 1, 1), 1218480d},
		{getDate(1915, 1, 1), 326700d},
		{getDate(1916, 1, 1), 298826d},
		{getDate(1917, 1, 1), 295403d},
		{getDate(1918, 1, 1), 110618d},
		{getDate(1919, 1, 1), 141132d},
		{getDate(1920, 1, 1), 430001d},
		{getDate(1921, 1, 1), 805228d},
		{getDate(1922, 1, 1), 309556d},
		{getDate(1923, 1, 1), 522919d},
		{getDate(1924, 1, 1), 706896d},
		{getDate(1925, 1, 1), 294314d},
		{getDate(1926, 1, 1), 304488d},
		{getDate(1927, 1, 1), 335175d},
		{getDate(1928, 1, 1), 307255d},
		{getDate(1929, 1, 1), 279678d},
		{getDate(1930, 1, 1), 241700d},
		{getDate(1931, 1, 1), 97139d},
		{getDate(1932, 1, 1), 35576d},
		{getDate(1933, 1, 1), 23068d},
		{getDate(1934, 1, 1), 29470d},
		{getDate(1935, 1, 1), 34956d},
		{getDate(1936, 1, 1), 36329d},
		{getDate(1937, 1, 1), 50244d},
		{getDate(1938, 1, 1), 67895d},
		{getDate(1939, 1, 1), 82998d},
		{getDate(1940, 1, 1), 70756d},
		{getDate(1941, 1, 1), 51776d},
		{getDate(1942, 1, 1), 28781d},
		{getDate(1943, 1, 1), 23725d},
		{getDate(1944, 1, 1), 28551d},
		{getDate(1945, 1, 1), 38119d},
		{getDate(1946, 1, 1), 108721d},
		{getDate(1947, 1, 1), 147292d},
		{getDate(1948, 1, 1), 170570d},
		{getDate(1949, 1, 1), 188317d},
		{getDate(1950, 1, 1), 249187d},
		{getDate(1951, 1, 1), 205717d},
		{getDate(1952, 1, 1), 265520d},
		{getDate(1953, 1, 1), 170434d},
		{getDate(1954, 1, 1), 208177d},
		{getDate(1955, 1, 1), 237790d},
		{getDate(1956, 1, 1), 321625d},
		{getDate(1957, 1, 1), 326867d},
		{getDate(1958, 1, 1), 253265d},
		{getDate(1959, 1, 1), 260686d},
		{getDate(1960, 1, 1), 265398d},
		{getDate(1961, 1, 1), 271344d},
		{getDate(1962, 1, 1), 283763d},
		{getDate(1963, 1, 1), 306260d},
		{getDate(1964, 1, 1), 292248d},
		{getDate(1965, 1, 1), 296697d},
		{getDate(1966, 1, 1), 323040d},
		{getDate(1967, 1, 1), 361972d},
		{getDate(1968, 1, 1), 454448d},
		{getDate(1969, 1, 1), 358579d},
		{getDate(1970, 1, 1), 373326d},
		{getDate(1971, 1, 1), 370478d},
		{getDate(1972, 1, 1), 384685d},
		{getDate(1973, 1, 1), 398515d},
		{getDate(1974, 1, 1), 393919d},
		{getDate(1975, 1, 1), 385378d},
		{getDate(1976, 1, 1), 499093d},
		{getDate(1977, 1, 1), 458755d},
		{getDate(1978, 1, 1), 589810d},
		{getDate(1979, 1, 1), 394244d},
		{getDate(1980, 1, 1), 524295d},
		{getDate(1981, 1, 1), 595014d},
		{getDate(1982, 1, 1), 533624d},
		{getDate(1983, 1, 1), 550052d},
		{getDate(1984, 1, 1), 541811d},
		{getDate(1985, 1, 1), 568149d},
		{getDate(1986, 1, 1), 600027d},
		{getDate(1987, 1, 1), 599889d},
		{getDate(1988, 1, 1), 641346d},
		{getDate(1989, 1, 1), 1090172d},
		{getDate(1990, 1, 1), 1535872d},
		{getDate(1991, 1, 1), 1826595d},
		{getDate(1992, 1, 1), 973445d},
		{getDate(1993, 1, 1), 903916d},
		{getDate(1994, 1, 1), 803993d},
		{getDate(1995, 1, 1), 720177d},
		{getDate(1996, 1, 1), 915560d},
		{getDate(1997, 1, 1), 797847d},
		{getDate(1998, 1, 1), 653206d},
		{getDate(1999, 1, 1), 644787d},
		{getDate(2000, 1, 1), 841002d},
		{getDate(2001, 1, 1), 1058902d},
		{getDate(2002, 1, 1), 1059356d},
		{getDate(2003, 1, 1), 703542d},
		{getDate(2004, 1, 1), 957883d},
		{getDate(2005, 1, 1), 1122373d},
		{getDate(2006, 1, 1), 1266264d}};

	static Double[][] getData() {
		return data;
	}
	static Object[][] getEvents() {
		return events;
	}

	static Double getDate(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("UTC"));
		cal.set(year, month, date);
		return (double) cal.getTimeInMillis();
	}
}