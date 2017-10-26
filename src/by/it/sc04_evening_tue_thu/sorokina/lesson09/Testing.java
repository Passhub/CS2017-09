package by.it.sc04_evening_tue_thu.sorokina.lesson09;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.math.BigInteger;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@SuppressWarnings("all") //море warnings. всех прячем.

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class Testing {
    @Test(timeout = 2000)
    public void slowA() throws Exception {
//        FiboA fibo = new FiboA();
//        BigInteger res = fibo.slowA(33);
        Class classFibo=findClass("FiboA1");
        Object fibo=classFibo.newInstance();

        Method m=findMethod(classFibo,"slowA",int.class);
        BigInteger res=(BigInteger)m.invoke(fibo,33);
        boolean ok = res.toString().equals("3524578");
        assertTrue("slowA failed", ok);
    }

    @Test(timeout = 2000)
    public void fastB() throws Exception {
        //замена для того, чтобы не было ошибок комплиляции когда сдают не всё.
        //  было так
        //        FiboB fibo = new FiboB();
        //        BigInteger res = fibo.fastB(55555);
        Class classFibo=findClass("FiboB1");
        Object fibo=classFibo.newInstance();
        Method m=findMethod(classFibo,"fastB",int.class);
        BigInteger res=(BigInteger)m.invoke(fibo,55555);
        boolean ok;
        ok = res.toString().equals(
                "909639027887347144342941161985282559355604430178183350584" +
                        "74374871702736654226345411577418045776411936117881" +
                        "80657005997816053010310459127659584979372801433810" +
                        "782738581295644963719716350303887502119870188785940191" +
                        "220816083698599440552682901736615546569886575184733255" +
                        "247582727959377286040444645420751096479067320036501349" +
                        "884060670954913003747650889954808829683235123929123126" +
                        "171012270839744310978434571640740344363137736508414820" +
                        "617748912875431845453193717707276393639302243820087322" +
                        "158302090821007666595444484804625078993575242024791503" +
                        "827707742258659119405879511070253481237335280693136635" +
                        "203845015124870537550215824164328500083890983067037524" +
                        "690013795724336908961146404676367450862538771632692010" +
                        "8007104249466898857746156445543276925492471316214659579890657879" +
                        "5216402666025860799868329860419563359713651103025221898184983" +
                        "33326777882308236748271124210312839263955686353710289830158475" +
                        "999500214307062459789469844204054111035478097782256582217187890" +
                        "5836685636670318316609386609202981350416675502168926283222103319" +
                        "258798073524908331967335663739592708768575160693887587735383269058" +
                        "8955023349748042094752571966441821834010923271474913790598239629039" +
                        "519932502908419611884576409184007723858280524552033084464978505228766" +
                        "085281806855311684732258287145651314447292832236994445033404827904282" +
                        "5756398128649189299103366024661602441794133250665668931074805954981148" +
                        "4339433261117033259300500652902600115830724750452473301964550639144809" +
                        "470925781705205968970158308389657887649940883753804405196006995646957" +
                        "2047500596953554361941234934573939411686452107468117988667781018965" +
                        "5029943251480664383798085171082408161272711072290337283377691041100" +
                        "7619235864817126801702604065158334293916156858599848629086275942621" +
                        "39616242419795574678143827103439900220006341191879645213600356407890" +
                        "50589914633555105921663775597157636147217275287621749853967344747382" +
                        "68089578234506515167275375031138709799221183193411830728781110315375410911538679" +
                        "19227401209457223786207779946894006339646947259956254528081961302469232429042241" +
                        "78395909150812078512604508365097019863744439165201415441653830831538390358772616" +
                        "59612382394632908007237421298532631111604945472400580867112299736836453942883040" +
                        "919301426094366040263165816911324753683371254510146219312091798708493014082923046" +
                        "997229461410584400431963646196252695714577178308225591412910064716932858200159965" +
                        "282243561088622912391823483428553478212367172161995145427807648571543023538682011" +
                        "2362473675002743571189699869465376810498476268331326263723315647756579" +
                        "70641545523598392909167955481457119817830082623455816062894209540469687455385" +
                        "575569476674039940711008474204307994961300581065435298861539733935163376567922" +
                        "721517142143870693595730772685170607264169021390358395399881188502427638248182" +
                        "4773402301045220580374887185496095997322732623801079701032778524540795850148224" +
                        "4652990761755479388859031821283122287721840056997889191238437505272712871852493" +
                        "4694661093439843049535858173127778867554834009090803582310094817387989046072275" +
                        "1243271744535473875286186362535142925577308382378322839568473172514039785809099" +
                        "3778735142971107877917648695418883569562780098796149300814672715052470047968219" +
                        "4654092491230343705472375989711563194519597413676122218700696331903370014042611" +
                        "8556832362656617192772548186974039191304300829706133300855126305819937112751590" +
                        "8652162390967175105092136170334368169929920822221048319122864277804355172077616" +
                        "1308201536353678451006349284573330815487139659744321673584559584535627067439581" +
                        "0100814755692705085856504605996344129778337540404746202982916609293172079892136" +
                        "1584799633799651319441288931990102669627924961461804826311251552301502813911564" +
                        "240763749454706737436446915478764093253509331303052497328407184783768473697596" +
                        "082336682652497191559611714175117353926272908666311634636587036530496113961626" +
                        "553145911902605253330146882091031958597897457922255149731961228025027215660043" +
                        "957946257293817523681841921310257703979760396401231144712148296260577649676412" +
                        "490779704580276123946492082944920070058808822658189082175411952869844899249228" +
                        "177798074397840575796297749873009965242227174749191651805873241272739329541238" +
                        "221756101570927647626522262243945871614071278145889723094554686832992823042105" +
                        "458416020058039977064673018172654124860142483809325513754205986363203268119115" +
                        "546462681032900305245041490208713345171365634497126630130628659838415453043744" +
                        "319590458479366720148629390982273038486656740358985561714847297633137747553707" +
                        "134099269640658200303349485845563346985518985494016958425529588104428392617792" +
                        "457170002980753624341475369878571228319928146732477104455888562352463451993470" +
                        "696077304003564167989156476688802873564030105623136430918874797523530508682009961" +
                        "91011948344776554103009085307995680563414671359598651630121488797996373720731202" +
                        "38334002164083141825552383359986157349055506671454613969971250993197318896380371" +
                        "73604470067868683905853274255067210014876250246256769039392822986299041466228346" +
                        "51957199696811929253171478604333326629007774356958857427029801535794680770905037" +
                        "78385793045257952950939571400815755338835778252681311651211593423223271033820090" +
                        "66269744636341746092366225039380837653306794873414146169678482685774235532648153" +
                        "17866087139506572080843449385505182272459464479509395117772996124167717295424141" +
                        "42576982603181588548594463903119620377875737240585329354450191149476257004704220" +
                        "39621889637297256656314660317339584421346545596433997575877173891602213562815969" +
                        "77495623753090322568865773961684758271943266367779354212487104646125891918500979" +
                        "13011941826600916151746153573160932425356307913018103818572231771494548545466579" +
                        "66829024040714187036087656295185660244450077702685207184655325736241962246428869" +
                        "74505809330265165030350143390097658437918211964113121653937479455047939932997514" +
                        "22908151987854767765817269975642144761884958625379183412350880981868626565168326" +
                        "05233953268019719785820020476514056074880937880476705903489630691287411426738115" +
                        "00135773124311152932222740519557001619953534991073087394326544916651211398626510" +
                        "22220977402790694292313265157926210586554304669753789549742695475816403068323026" +
                        "64388365960810289510666395492850727463870941371527697372223480092496862855133959" +
                        "31946569506662331783292301713001717908967609779776007030544909080337799190614174" +
                        "30767972754011226620011447787770040516989025818170004928836489506904080580895410" +
                        "79072967881779055482940280741572282906404880432521404876886786897320544791332118" +
                        "50172033667681341248938764781061694090681668452563456036147559522009954505065032" +
                        "53096322589741111272573860520318560975126951189832398691354790155624215487306220" +
                        "43079863205022604408281329727867453385236061571527247114650599783181429437350828" +
                        "95756898639269361570185628474036669578930464747942318322457679157649504630638194" +
                        "18934599036046132748550708580576092027307732454889200961677384186109536709266079" +
                        "85398547652353134641546494122919495450556309268732797160299459787198690165570554" +
                        "68664309757911201736532704454917881764671254470145930301428114266241566672842376" +
                        "06937924697282519593068350824281461162360460317917445333603270404304171598255866" +
                        "61698862530854548054715499805222264365771117468227741470179278923455039844424356" +
                        "37833504425590555419082695764479784008985560788541849753134208636449923364182601" +
                        "23115661138641838759121980922980182746613943486465087534850232586744133841747636" +
                        "71004631484674583167099409877958052442280953584588319654112592581802793452493579" +
                        "57679424772973501671995111587223757292981432755627779892109392377294595005812001" +
                        "51961622610294719193912857664983695747089418077848341842747479353605964240934175" +
                        "11741968004382168656347352577035698689763394593199611402744129399366607990377186" +
                        "26227854389286261139239110639366278696811730249969825736023926577791692629005098" +
                        "96269475824282258512914113759956518014684249546781380028633024426568315690423091" +
                        "17607844806249493861835379585628715776150039665396354551037682646828593746119871" +
                        "76147854862843316248563797619503429414440399024396291454703938356398479261150141" +
                        "67679471960937462655579715056840092791540700933617938096273282334596764346928341" +
                        "22302430986921805153639853775380210111092983795576923610381386905549509970326288" +
                        "34090120417618487240213331954546599516469803594216770642107068636601688610162365" +
                        "59537365045396235129819997695240203563639949785452598555874284145741040777257331" +
                        "88061474373243816225228414776414803500574155434454627939447243893132482028802627" +
                        "45198082426938690804144443866750289183731534014907683808433518484271136194787441" +
                        "26210371863122440093613655447577113249000267942356307385248399435895311440865406" +
                        "54176977446296310684426999575111116531236588914898527003084487717435942933651167" +
                        "54548616070784836871942000660906427192230935764271101505881102621938471574211023" +
                        "06411197089273574347086542400800528633585357786827095878525421498709518886724470" +
                        "95400597819790696471847700219898764328366457783375229123801746037935466168351804" +
                        "41192586581964036881198639110019694574934984160885915395228052714196787467635818" +
                        "38734245715754721462086955985058439722368277588862050210922965588458008390805204" +
                        "82668238608542365583635093403131525343624869668463437507021829199664510178589467" +
                        "99720532329992684633917924913972025986985325492093060384070893891708140421900475" +
                        "16687465343718894057618663112796109731136276137806006584813314845139426531979308" +
                        "35580491557856599041377337663145379985513703809074177350805513382286052524351328" +
                        "35270615890591722864536794419983527145136503947952951053549869438639825822025301" +
                        "67265532500296148726539153598148766840870641239364617379750315388889503569004926" +
                        "35142065629878960364572895102132435214304261467403925142211579869754771363112380" +
                        "76989931649256453746698054600778092761039544768960345096253943859472040501852178" +
                        "55524099622360537052794654126314130181596293144127267509390351018246614606419621" +
                        "60816999125316732431811158411838418787307732433223510147297883705969705990087423" +
                        "94449892240128346386571877264617991902543731452240705074534909234442309168679590" +
                        "17257447376941662132028194306992196255147173779906789871155483492726999503177894" +
                        "81403351161947908390869845798959837049501264411832951681985333022663356541291863" +
                        "49982830881263953803987934767169538352545922570315657906166135250004952037466620" +
                        "94756817245475391242659231997308097443779983219354573130426611778478692593591583" +
                        "61754691479929680452578971320691221453126705233921119011228272162717529094167710" +
                        "68045964925434282949005735604682714650256896871050846684681896196397677168884863" +
                        "00937738962512530217833483251969414978948838418010674059964119031192844349921473" +
                        "18989033356264429887173356726817836950771313977041478729743988667177225331700472" +
                        "63580400610682775708985280153554785632785320312907932324436813165645779399421673" +
                        "29056757668531416126638187915973262788310855346242953743907089052889700419942324" +
                        "39736242560694140972750669063596402015483708983869608148446112190440056829552071" +
                        "63835959634006357193477422584573800040782799950582182361924281438536312779274751" +
                        "08860128155160872714269943851277340373266639438556500597050794352027301766865935" +
                        "88314677719335975906450657749969294514296139984718536384603548941191672800519012" +
                        "51336200516803040625924940053710561137112956675632427454761259632207753942091875" +
                        "67930808056120453037041093082967574251679712066113534102230967327013521657561065" +
                        "45164371945165353072420522968137120015291278048142820950831627018950007612158284" +
                        "10813996958081473751647070807611939031877558708467581094629333550193725294925131" +
                        "55055378096677369110652175673711075578590299120574710961154283757840850882013305" +
                        "75368931195373365409085988170009322331564107345581076783411928537687910065254438" +
                        "16175908183831186618514149626128097569477531991251715025455568317993227891702411" +
                        "48215338109963325425668997935546328658765991089842850466571454347611327119513293" +
                        "51948936233595817917410502503482809958866910507749959736516888038707567611035665" +
                        "435733128026123516728383266144372735449794479591089495388" +
                        "4419939619445")

        ;
        assertTrue("fastB failed", ok);
    }


    @Test(timeout = 2000)
    public void fasterC() throws Exception {
        Class classFibo=findClass("FiboC1");
        Object fibo=classFibo.newInstance();
        Method m=findMethod(classFibo,"fasterC",long.class, int.class);
        //FiboC fibo = new FiboC();
        assertTrue("fasterC failed 1", (long)m.invoke(fibo,10, 2) == 1L);
        assertTrue("fasterC failed 2", (long)m.invoke(fibo,1, 2) == 1L);
        assertTrue("fasterC failed 3", (long)m.invoke(fibo,999999999, 321) == 34L);
    }


    /*
    ===========================================================================================================
    НИЖЕ ВСПОМОГАТЕЛЬНЫЙ КОД ТЕСТОВ. НЕ МЕНЯЙТЕ В ЭТОМ ФАЙЛЕ НИЧЕГО.
    Но изучить как он работает - можно, это всегда будет полезно.
    ===========================================================================================================
     */
    private Class findClass(String SimpleName) {
        String full = this.getClass().getName();
        String dogPath = full.replace(this.getClass().getSimpleName(), SimpleName);
        try {
            return Class.forName(dogPath);
        } catch (ClassNotFoundException e) {
            fail("\nТест не пройден. Класс " + SimpleName + " не найден.");
        }
        return null;
    }

    private Method findMethod(Class<?> cl, String name, Class... param) {
        try {
            return cl.getDeclaredMethod(name, param);
        } catch (NoSuchMethodException e) {
            fail("\nТест не пройден. Метод " + cl.getName() + "." + name + " не найден");
        }
        return null;
    }

    private Object invoke(Method method, Object o, Object... value) {
        try {
            return method.invoke(o, value);
        } catch (Exception e) {
            fail("\nНе удалось вызвать метод " + method.getName());
        }
        return null;
    }


    //метод находит и создает класс для тестирования
    //по имени вызывающего его метода, testTaskA1 будет работать с TaskA1
    private static Testing run( String in) {
        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();
        StackTraceElement element;
        int i = 0;
        do {
            element = trace[i++];
        }
        while (!element.getMethodName().contains("test"));

        String[] path = element.getClassName().split("\\.");
        String nameTestMethod = element.getMethodName();
        String clName = nameTestMethod.replace("test", "");
        clName = element.getClassName().replace(path[path.length - 1], clName);
        System.out.println("\n---------------------------------------------");
        System.out.println("Старт теста для " + clName + "\ninput:" + in);
        System.out.println("---------------------------------------------");
        return new Testing(clName, in);
    }

    public Testing() {
        //Конструктор тестов
    }

    //Конструктор тестов
    //    private Testing(String className) {
    //        this(className, "");
    //    }

    //Основной конструктор тестов
    private Testing(String className, String in) {
        //this.className = className;
        Class<?> c = null;
        try {
            c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            fail("Не найден класс " + className);
        }
        reader = new StringReader(in); //заполнение ввода
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return reader.read();
            }
        };
        System.setIn(inputStream);   //перехват ввода

        System.setOut(newOut); //перехват стандартного вывода
        try {
            Class[] argTypes = new Class[]{String[].class};
            Method main = c.getDeclaredMethod("main", argTypes);
            main.invoke(null, (Object) new String[]{});

        } catch (Exception x) {
            x.printStackTrace();
        }
        System.setOut(oldOut); //возврат вывода
    }

    //проверка вывода
    private Testing is( String str) {
        assertTrue("Ожидается такой вывод:\n<---начало---->\n" + str + "<---конец--->",
                stringWriter.toString().equals(str));
        return this;
    }

    private Testing include( String str) {
        assertTrue("Строка не найдена: " + str + "\n", stringWriter.toString().contains(str));
        return this;
    }

    private Testing exclude( String str) {
        assertTrue("Лишние данные в выводе: " + str + "\n", !stringWriter.toString().contains(str));
        return this;
    }


    //переменные теста
    private StringWriter stringWriter = new StringWriter();
    private PrintStream oldOut = System.out;
    private StringReader reader;


    //поле для перехвата потока вывода
    private PrintStream newOut;

    {
        newOut = new PrintStream(new OutputStream() {
            private byte bytes[] = new byte[2];

            @Override
            public void write(int b) throws IOException {
                if (b < 0) { //ловим и собираем двухбайтовый UTF (первый код > 127, или в байте <0)
                    if (bytes[0] == 0) { //если это первый байт
                        bytes[0] = (byte) b; //то запомним его
                    } else {
                        bytes[1] = (byte) b; //иначе это второй байт
                        String s = new String(bytes); //соберем весь символ
                        stringWriter.append(s); //запомним вывод для теста
                        oldOut.append(s); //копию в обычный вывод
                        bytes[0] = 0; //забудем все.
                    }
                } else {
                    char c = (char) b; //ловим и собираем однобайтовый UTF
                    bytes[0] = 0;
                    if (c != '\r') {
                        stringWriter.write(c); //запомним вывод для теста
                    }
                    oldOut.write(c); //копию в обычный вывод
                }
            }
        });
    }
}
