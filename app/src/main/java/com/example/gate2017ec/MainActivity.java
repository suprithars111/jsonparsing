package com.example.gate2017ec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);



        String gateece2017_array = "{\"gateece2017\": [\n" +
                "                {\n" +
                "\t\t\t\"question_number\": 1,\n" +
                "\t\t\t\"question\": \"She has a sharp tongue and it can occasionally turn\",\n" +
                "\t\t\t\"options\": [\"Hurtful\", \"left\", \"Methodical\", \"vital\"],\n" +
                "\t\t\t\"correct_answer\": \"Hurtful\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 2,\n" +
                "\t\t\t\"question\": \"Some table are shelves. Some shelves are chairs. All chairs are benches. Which of the following conclusion can be deduced from the preceding sentences?\",\n" +
                "\t\t\t\"options\": [\"At least one bench is a table\", \"At least one shelf is a bench\", \"At least one chair is a table\", \"All benches are chairs\"],\n" +
                "\t\t\t\"correct_answer\": \"At least one shelf is a bench\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 3,\n" +
                "\t\t\t\"question\": \"40% of deaths on city roads may be attributed to drunken driving. The number of degree needed to represent this as a slice of a pie chart is\",\n" +
                "\t\t\t\"options\": [\"120\", \"144\", \"160\", \"212\"],\n" +
                "\t\t\t\"correct_answer\": \"144\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 4,\n" +
                "\t\t\t\"question\": \"In the summer, water consumption is known to decrease overall by 25%. A water Board official states that in the summer household consumption decreases by 20%, while other consumption increases by 70%. Which of the following statement is correct? \",\n" +
                "\t\t\t\"options\": [\"The ratio of household to other consumption is 8/17\", \"The ratio of household to other consumption is 1/17\", \"The ratio of household to other consumption is 17/8\", \"There are errors in the official’s statement\"],\n" +
                "\t\t\t\"correct_answer\": \"There are errors in the official’s statement\",\n" +
                "\t\t\t\"correct_option_number\": 4\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 5,\n" +
                "\t\t\t\"question\": \"I _____ made arrangements had I _____informed earlier.\",\n" +
                "\t\t\t\"options\": [\"could have, been\", \"would have, being\", \"had, have\", \"had been, been\"],\n" +
                "\t\t\t\"correct_answer\": \"could have, been\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 6,\n" +
                "\t\t\t\"question\": \"“If you are looking for a history of India, or for an account of the rise and fall of the British Raj, or for the reason of the cleaving of the subcontinent into two mutually antagonistic parts and the effects this mutilation will have in the respective section, and ultimately on Asia, you will not find it in these pages; for though I have spent a lifetime in the country. I lived too near the seat of events, and was too intimately associated with the actors, to get the perspective needed for the impartial recording of these matters”. Here, the word „antagonistic‟ is closest in meaning to\",\n" +
                "\t\t\t\"options\": [\"Impartial\", \"Argumentative\", \"Separated\", \"Hostile\"],\n" +
                "\t\t\t\"correct_answer\": \"Hostile\",\n" +
                "\t\t\t\"correct_option_number\": 4\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 7,\n" +
                "\t\t\t\"question\": \"There are 3 Indians and 3 Chinese in a group of 6 people. How many subgroups of this group can we choose so that every subgroup has at least one Indian?\",\n" +
                "\t\t\t\"options\": [\"56\", \"52\", \"48\", \"44\"],\n" +
                "\t\t\t\"correct_answer\": \"56\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 8,\n" +
                "\t\t\t\"question\": \"Trucks (10m long) and cars (5 m long) go on a single lane bridge. There must be a gap of atleast 20 m after each truck and a gap of atleast 15m after each car. Trucks and cars travel at a speed of 36 km/h. If cars and trucks go alternatively, what is the maximum number of vehicles that can use the bridge in one hour?\",\n" +
                "\t\t\t\"options\": [\"1440\", \"1200\", \"720\", \"600\"],\n" +
                "\t\t\t\"correct_answer\": \"1440\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 9,\n" +
                "\t\t\t\"question\": \"S, T, U, V, W, X, Y and Z are seated around a circular table. T’s neighbours are Y and V. Z is seated third to the left of T and second to the right of S.U’s neighbours are S and Y; and T and W are not seated opposite each other. Who is third to the left of V?\",\n" +
                "\t\t\t\"options\": [\"X\", \"W\", \"U\", \"T\"],\n" +
                "\t\t\t\"correct_answer\": \"X\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 10,\n" +
                "\t\t\t\"question\": \"The clock frequency of an 8085 microprocessor is 5 MHz. If the time required to execute an instruction is 1.4 μs, then the number of T-states needed for executing the instruction is\",\n" +
                "\t\t\t\"options\": [\"1\", \"6\", \"7\", \"8\"],\n" +
                "\t\t\t\"correct_answer\": \"7\",\n" +
                "\t\t\t\"correct_option_number\": 3\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 11,\n" +
                "\t\t\t\"question\": \"Consider the following statement about the linear dependence of the real valued functions y1 = 1, y2 = x and y3 =x2, over the field of real numbers. I. y1, y2 and y3 are linearly independent on -1 ≤ x ≤ 0 II. y1 , y2 and y3 are linearly dependent on 0 ≤ x ≤ 1 III. y1 , y2 and y3 are linearly independent on 0 ≤x ≤ 1 IV. y1, y2 and y3 are linearly dependent on -1 ≤ x ≤ 0 Which one among the following is correct?\",\n" +
                "\t\t\t\"options\": [\"Which one among the following is correct?\", \"Both I and III are true\", \"Both II and IV are true\", \"Both III and IV are true\"],\n" +
                "\t\t\t\"correct_answer\": \"Both I and III are true\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 12,\n" +
                "\t\t\t\"question\": \"A bar of Gallium Arsenide (GaAs) is doped with Silicon such that the Silicon atoms occupy Gallium and Arsenic sites in the GaAs crystal. Which one of the following statement is true?\",\n" +
                "\t\t\t\"options\": [\"Silicon atoms act as p-type dopants in Arsenic sites and n-type dopants in Gallium sites\", \"Silicon atoms act as n-type dopants in Arsenic sites and p-type dopants in Gallium sites\", \"Silicon atoms act as p-type dopants in Arsenic as well as Gallium sites\", \"Silicon atoms act as n-type dopants in Arsenic as well as Gallium sites\"],\n" +
                "\t\t\t\"correct_answer\": \"Silicon atoms act as p-type dopants in Arsenic sites and n-type dopants in Gallium sites\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 13,\n" +
                "\t\t\t\"question\": \"The Miller effect in the context of a Common Emitter amplifier explains\",\n" +
                "\t\t\t\"options\": [\"an increase in the low-frequency cutoff frequency\", \"an increase in the high-frequency cutoff frequency\", \"a decrease in the low-frequency cutoff frequency\", \"a decrease in the high-frequency cutoff frequency\"],\n" +
                "\t\t\t\"correct_answer\": \"a decrease in the high-frequency cutoff frequency\",\n" +
                "\t\t\t\"correct_option_number\": 4\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 14,\n" +
                "\t\t\t\"question\": \"Three fair cubical dice are thrown simultaneously. The probability that all three dice have the same number of dots on the faces showing up is (up to third decimal place) \",\n" +
                "\t\t\t\"options\": [\"0.028\", \"1.02\", \"0.034\", \"1.80\"],\n" +
                "\t\t\t\"correct_answer\": \"0.028\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 15,\n" +
                "\t\t\t\"question\": \"A good transconductance amplifier should have\",\n" +
                "\t\t\t\"options\": [\"high input resistance and low output resistance\", \"low input resistance and high output resistance\", \"high input and output resistances\", \"low input and output resistance\"],\n" +
                "\t\t\t\"correct_answer\": \"high input and output resistances\",\n" +
                "\t\t\t\"correct_option_number\": 3\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 16,\n" +
                "\t\t\t\"question\": \"Let (X1, X2) be independent random variables. X1 has mean 0 and variance 1, while X2 has mean 1 and variance 4. The mutual information I (X1 ; X2 ) between X1 and X2 in bits is \",\n" +
                "\t\t\t\"options\": [\"0\", \"1\", \"2\", \"none of these\"],\n" +
                "\t\t\t\"correct_answer\": \"0\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 17,\n" +
                "\t\t\t\"question\": \"Consider a wireless communication link between a transmitter and a receiver located in free space, with finite and strictly positive capacity. If the effective areas of the transmitter and the receiver antennas, and the distance between them are all doubled, and everything else remains unchanged, the maximum capacity of the wireless link\",\n" +
                "\t\t\t\"options\": [\"increases by a factor of 2\", \"decrease by a factor 2\", \"remains unchanged\", \"decreases by a factor of root 2\"],\n" +
                "\t\t\t\"correct_answer\": \"remains unchanged\",\n" +
                "\t\t\t\"correct_option_number\": 3\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 18,\n" +
                "\t\t\t\"question\": \"Starting with x = 1, the solution of the equation x^3 + x +1, after two iterations of Newton- Raphson’s method (up to two decimal places) is\",\n" +
                "\t\t\t\"options\": [\"0.69\", \"0.23\", \"1.12\", \"2\"],\n" +
                "\t\t\t\"correct_answer\": \"0.69\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 19,\n" +
                "\t\t\t\"question\": \"An optical fiber is kept along the zˆ direction. The refractive indices for the electric fields along xˆ and yˆ directions in the fiber are n x =1.5000 and n y =1.5001, respectively (n x ≠ n y due to the imperfection in the fiber cross-section). The free space wavelength of a light wave propagating in the fiber is 1.5\uF06Dm. If the light wave is circularly polarized at the input of the fiber, the minimum propagation distance after which it becomes linearly polarized, in centimeter, is\",\n" +
                "\t\t\t\"options\": [\"0.375 cm\", \"0.5 cm\", \"1.234 cm\", \"none of these\"],\n" +
                "\t\t\t\"correct_answer\": \"0.375 cm\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 20,\n" +
                "\t\t\t\"question\": \"Which one of the following options correctly describes the locations of the roots of the equation s^4 +s^2 +1 =0 on the complex plane?\",\n" +
                "\t\t\t\"options\": [\"Four left half plane (LHP) roots\", \"One right half plane (RHP) root, one LHP root and two roots on the imaginary axis\", \"Two RHP roots and two LHP roots\", \"All four roots are on the imaginary axis\"],\n" +
                "\t\t\t\"correct_answer\": \"Two RHP roots and two LHP roots\",\n" +
                "\t\t\t\"correct_option_number\": 3\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 21,\n" +
                "\t\t\t\"question\": \"The Nyquist plot of the transfer function G(s) = K/(s^2 + 2s +2)(s+2) does not encircle the point (1+j0) for K=10 but does encircle the point (-1+j0) for K=100. The closed loop system (having unity gain feedback) is\",\n" +
                "\t\t\t\"options\": [\"stable for K = 10 and stable for K = 100\", \"stable for K = 10 and unstable for K = 100\", \"unstable for K = 10 and stable for K =100\", \"unstable for K = 10 and unstable for K = 100\"],\n" +
                "\t\t\t\"correct_answer\": \"stable for K = 10 and unstable for K = 100\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 22,\n" +
                "\t\t\t\"question\": \"Let x(t) be a continuous time periodic signal with fundamental period T = 1 seconds. Let ak be the complex Fourier series coefficients of x(t), where k is integer valued. Consider the following statements about x(3t): I.The complex Fourier series coefficients of x(3t) are ak where k is integer valued II.The complex Fourier series coefficients of x(3t) are 3ak where k is integer valued III.The fundamental angular frequency of x(3t) is 6π rad/s\",\n" +
                "\t\t\t\"options\": [\"only II and III are true\", \"only I and III are true\", \"only III is true\", \"only I is true\"],\n" +
                "\t\t\t\"correct_answer\": \"only I and III are true\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 23,\n" +
                "\t\t\t\"question\": \"In a DRAM,\",\n" +
                "\t\t\t\"options\": [\"periodic refreshing is not required\", \"information is stored in a capacitor\", \"information is stored in a latch\", \"both read and write operations can be performed simultaneously\"],\n" +
                "\t\t\t\"correct_answer\": \"information is stored in a capacitor\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 24,\n" +
                "\t\t\t\"question\": \"A connection is made consisting of resistance A in series with a parallel combination of resistances B and C. Three resistors of value 10 ohm ,5 ohm ,2 ohm are provided. Consider all possible permutations of the given resistors into the positions A, B, C, and identify the configurations with maximum possible overall resistance, and also the ones with minimum possible overall resistance. The ratio of maximum to minimum values of the resistances (up to second decimal place) is\",\n" +
                "\t\t\t\"options\": [\"2.14\", \"1.12\", \"2\", \"0.24\"],\n" +
                "\t\t\t\"correct_answer\": \"2.14\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 25,\n" +
                "\t\t\t\"question\": \"An npn bipolar junction transistor (BJT) is operating in the active region. If the reverse bias across the base – collector junction is increased, then\",\n" +
                "\t\t\t\"options\": [\"the effective base width increases and common –emitter current gain increases\", \"the effective base width increases and common – emitter current gain decreases\", \"the effective base width decreases and common–emitter current gain increases\", \"the effective base width decreases and common–emitter current gain decreases\"],\n" +
                "\t\t\t\"correct_answer\": \"the effective base width decreases and common– emitter current gain increases\",\n" +
                "\t\t\t\"correct_option_number\": 3\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 26,\n" +
                "\t\t\t\"question\": \"A two – wire transmission line terminates in a television set. The VSWR measured on the line is 5.8. The percentage of power that is reflected from the television set is\",\n" +
                "\t\t\t\"options\": [\"34.32\", \"49.82\", \"47.21\", \"54.32\"],\n" +
                "\t\t\t\"correct_answer\": \"49.82\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 27,\n" +
                "\t\t\t\"question\": \"Which of the following statements is incorrect?\",\n" +
                "\t\t\t\"options\": [\"Lead compensator is used to reduce the settling time.\", \"Lag compensator is used to reduce the steady state error.\", \"Lead compensator may increase the order of a system.\", \"Lag compensator always stabilizes an unstable system.\"],\n" +
                "\t\t\t\"correct_answer\": \"Lag compensator always stabilizes an unstable system.\",\n" +
                "\t\t\t\"correct_option_number\": 4\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 28,\n" +
                "\t\t\t\"question\": \"The residues of a function f(z) 1/(z-4)(z+1)^3 are\",\n" +
                "\t\t\t\"options\": [\"-1/27 and -1/125\", \"1/125 and -1/125\", \"-1/27 and 1/5\", \"1/125 and -1/5\"],\n" +
                "\t\t\t\"correct_answer\": \"1/125 and -1/125\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 29,\n" +
                "\t\t\t\"question\": \"A sinusoidal message signal is converted to a PCM signal using a uniform quantizer. The required signal-to-quantization noise ratio (SQNR) at the output of the quantizer is 40dB. The minimum number of bits per sample needed to achieve the desired SQNR is\",\n" +
                "\t\t\t\"options\": [\"9\", \"8\", \"6\", \"7\"],\n" +
                "\t\t\t\"correct_answer\": \"7\",\n" +
                "\t\t\t\"correct_option_number\": 4\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 30,\n" +
                "\t\t\t\"question\": \"Consider the random process X(t)=U+Vt, where U is a zero-mean Gaussian random variable and V is a random variable uniformly distributed between 0 and 2. Assume that U and V are statistically independent. The mean value of the random process at t = 2 is\",\n" +
                "\t\t\t\"options\": [\"2\", \"4\", \"6\", \"3\"],\n" +
                "\t\t\t\"correct_answer\": \"2\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 31,\n" +
                "\t\t\t\"question\": \"The smaller angle (in degrees) between the planes x + y + z =1 and 2x – y + 2z = 0 is\",\n" +
                "\t\t\t\"options\": [\"54.73\", \"24.53\", \"34.24\", \"32.21\"],\n" +
                "\t\t\t\"correct_answer\": \"54.73\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 32,\n" +
                "\t\t\t\"question\": \"The un-modulated carrier power in an AM transmitter is 5kW. This carrier is modulated by a sinusoidal modulating signal. The maximum percentage of modulation is 50%. If it is reduced to 40%, then the maximum un-modulated carrier power (in kW) that can be used without overloading the transmitter is\",\n" +
                "\t\t\t\"options\": [\"5.22\", \"6\", \"4\", \"6.125\"],\n" +
                "\t\t\t\"correct_answer\": \"5.22\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 33,\n" +
                "\t\t\t\"question\": \"An electron (q1) is moving in free space with velocity 5 10 m/ s towards a stationary electron (q2) far away. The closest distance that this moving electron gets to the stationary electron before the repulsive force diverts its path is _____ × 10-7 m \",\n" +
                "\t\t\t\"options\": [\"5.058 × 10-8 m\", \"2.432 × 10-8 m\", \"3.245 × 10-8 m\", \"5.242 × 10-5 m\"],\n" +
                "\t\t\t\"correct_answer\": \"5.058 × 10-8 m\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 34,\n" +
                "\t\t\t\"question\": \"Passengers try repeatedly to get a seat reservation in any train running between two stations until they are successful. If there is 40% chance of getting reservation in any attempt by a passenger, then the average number of attempts that passengers need to make to get a seat reserved is\",\n" +
                "\t\t\t\"options\": [\"2.5\", \"3.6\", \"4.2\", \"7.2\"],\n" +
                "\t\t\t\"correct_answer\": \"2.5\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 35,\n" +
                "\t\t\t\"question\": \"A unity feedback control system is characterized by the open-loop transfer function G(S) = 2(s +1)/ s^3 + ks^2 +2s + 1 \",\n" +
                "\t\t\t\"options\": [\"0.75\", \"1.20\", \"0.12\", \"2\"],\n" +
                "\t\t\t\"correct_answer\": \"0.75\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 36,\n" +
                "\t\t\t\"question\": \"Standard air – filled rectangular waveguides of dimensions a = 2.29 cm and b= 1.02 cm are designed for radar applications. It is desired that these waveguides operate only in the dominatnt TE10 mode but not higher than 95% of the next higher cutoff frequency. The range of the allowable operating frequency f is\",\n" +
                "\t\t\t\"options\": [\"8.19GHz <= f <= 13.1GHz\", \"8.19GHz <= f <= 12.45GHz\", \"6.55GHz <= f <= 13.1GHz\", \"1.64GHz <= f <= 10.24GHz\"],\n" +
                "\t\t\t\"correct_answer\": \"8.19GHz <= f <= 12.45GHz\",\n" +
                "\t\t\t\"correct_option_number\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"question_number\": 37,\n" +
                "\t\t\t\"question\": \"For an intensity of incident light on a silicon pn junction solar cell, the photocurrent density (JL) is 2.5 mA/cm2 and the open-circuit voltage (VoC. is 0.451 V. consider thermal voltage (VT) to be 25mV. If the intensity of the incident light is increased by 20 times, assuming that the temperature remains unchanged. Voc (in volts) will be\",\n" +
                "\t\t\t\"options\": [\"0.6\", \"1.20\", \"2\", \"3\"],\n" +
                "\t\t\t\"correct_answer\": \"0.6\",\n" +
                "\t\t\t\"correct_option_number\": 1\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";


        try {
            JSONObject jsonObject = new JSONObject(gateece2017_array);
            JSONArray jsonArray = jsonObject.getJSONArray("gateece2017");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                String questionNumber = object.getString("question_number");
                String question = object.getString("question");
                String options = object.getString("options");
                String correctAnswer = object.getString("correct_answer");
                String correctOption = object.getString("correct_option_number");
                arrayList.add(questionNumber + ")" + question + '\n' + options + '\n' + correctAnswer + '\n' + correctOption);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getApplicationContext()
                        ,arrayList.get(position),Toast.LENGTH_SHORT).show();
            }
        });

    }
}