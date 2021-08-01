package am.therapy.data

import am.therapy.R

data class ICD10Data(
        val desDif: String,
        val desDifNameENG: String,
        val desDifNameRU: String,
        val desICD: Int,
)

val deseases1 = listOf(
        ICD10Data("A00-A09","Intestinal infections", "Кишечные инфекции" , R.string.icd10_A00_A09),
        ICD10Data("A15-A19","Tuberculosis", "Туберкулез", R.string.icd10_A15_A19),
        ICD10Data("A20-A28","Some bacterial zoonoses", "Некоторые бактериальные зоонозы ", R.string.icd10_A20_A28),
        ICD10Data("A30-A49","Other bacterial diseases", "Другие бактериальные болезни" , R.string.icd10_A30_A49),
        ICD10Data("A50-A64","Predominantly sexually transmitted infections", "Инфекции, передающиеся преимущественно половым путем ", R.string.icd10_A50_A64),
        ICD10Data("A65-A69","Other diseases caused by spirochetes", "Другие болезни, вызываемые спирохетами" , R.string.icd10_A65_A69),
        ICD10Data("A70-A74","Other diseases caused by chlamydia", "Другие болезни, вызываемые хламидиями" , R.string.icd10_A70_A74),
        ICD10Data("A75-A79","Rickettsioses", "Риккетсиозы" , R.string.icd10_A75_A79),
        ICD10Data("A80-A89","Viral infections of the central nervous system", "Вирусные инфекции центральной нервной системы" , R.string.icd10_A80_A89),
        ICD10Data("A92-A99","Arthropod-borne viral fevers and viral hemorrhagic fevers", "Вирусные лихорадки, передаваемые членистоногими, и вирусные геморрагические лихорадки" , R.string.icd10_A92_A99),
        ICD10Data("B00-B09","Viral infections characterized by lesions of the skin and mucous membranes", "Вирусные инфекции, характеризующиеся поражениями кожи и слизистых оболочек" , R.string.icd10_B00_B09),
        ICD10Data("B15-B19","Viral hepatitis", "Вирусный гепатит" , R.string.icd10_B15_B19),
        ICD10Data("B20-B24","Disease caused by human immunodeficiency virus [HIV]", "Болезнь, вызванная вирусом иммунодефицита человека [ВИЧ]" , R.string.icd10_B20_B24),
        ICD10Data("B25-B34","Other viral diseases", "Другие вирусные болезни" , R.string.icd10_B25_B34),
        ICD10Data("B35-B49","Mycoses", "Микозы" , R.string.icd10_B35_B49),
        ICD10Data("B50-B64","Protozoal diseases", "Протозойные болезни" , R.string.icd10_B50_B64),
        ICD10Data("B65-B83","Helminthiases", "Гельминтозы" , R.string.icd10_B65_B83),
        ICD10Data("B85-B89","Pediculosis, acariasis and other infestations", "Педикулез, акариаз и другие инфестации" , R.string.icd10_B85_B89),
        ICD10Data("B90-B94","Consequences of infectious and parasitic diseases", "Последствия инфестационных и паразитарных болезней" , R.string.icd10_B90_B94),
        ICD10Data("B95-B98","Bacterial, viral and other infectious agents", "Бактериальные, вирусные и другие инфекционные агенты" , R.string.icd10_B95_B98),
        ICD10Data("B99-B99","Other infectious diseases", "Другие инфекционные болезни" , R.string.icd10_B99_B99)
)

val deseases2 = listOf(
        ICD10Data("C00-C14","Malignant neoplasms of the lip, mouth and pharynx", "Злокачественные новообразования губы, полости рта и глотки ", R.string.icd10_C00_C14),
        ICD10Data("C15-C26","Malignant neoplasms of the digestive system", "Злокачественные новообразования органов пищеварения ", R.string.icd10_C15_C26),
        ICD10Data("C30-C39","Malignant neoplasms of the respiratory and chest organs", "Злокачественные новообразования органов дыхания и грудной клетки ", R.string.icd10_C30_C39),
        ICD10Data("C40-C41","Malignant neoplasms of bones and articular cartilage", "Злокачественные новообразования костей и суставных хрящей ", R.string.icd10_C40_C41),
        ICD10Data("C43-C44","Malignant neoplasms of the skin", "Злокачественные новообразования кожи ", R.string.icd10_C43_C44),
        ICD10Data("C45-C49","Malignant neoplasms of mesothelial and soft tissues", "Злокачественные новообразования мезотелиальной и мягких тканей ", R.string.icd10_C45_C49),
        ICD10Data("C50-C50","Malignant neoplasms of the breast", "Злокачественные новообразования молочной железы ", R.string.icd10_C50_C50),
        ICD10Data("C51-C58","Malignant neoplasms of female genital organs", "Злокачественные новообразования женских половых органов ", R.string.icd10_C51_C58),
        ICD10Data("C60-C63","Malignant neoplasms of the male genital organs", "Злокачественные новообразования мужских половых органов ", R.string.icd10_C60_C63),
        ICD10Data("C64-C68","Malignant neoplasms of the urinary tract", "Злокачественные новообразования мочевых путей ", R.string.icd10_C64_C68),
        ICD10Data("C69-C72","Malignant neoplasms of the eye, brain and other parts of the central nervous system", "Злокачественные новообразования глаза, головного мозга и других отделов центральной нервной системы ", R.string.icd10_C69_C72),
        ICD10Data("C73-C75","Malignant neoplasms of the thyroid and other endocrine glands", "Злокачественные новообразования щитовидной и других эндокринных желез ", R.string.icd10_C73_C75),
        ICD10Data("C76-C80","Malignant neoplasms of ill-defined, secondary and unspecified localizations", "Злокачественные новообразования неточно обозначенные, вторичные и неуточненных локализаций ", R.string.icd10_C76_C80),
        ICD10Data("C81-C96","Malignant neoplasms of lymphoid, hematopoietic and related tissues, which are designated as primary or presumably primary", "Злокачественные новообразования лимфоидной, кроветворной и родственных им тканей, которые обозначены как первичные или предположительно первичные ", R.string.icd10_C81_C96),
        ICD10Data("C97-C97","Malignant neoplasms of independent (primary) multiple localizations", "Злокачественные новообразования самостоятельных (первичных) множественных локализаций ", R.string.icd10_C97_C97),
        ICD10Data("D00-D09","In situ lesions", "In situ новообразования ", R.string.icd10_D00_D09),
        ICD10Data("D10-D36","Benign neoplasms", "Доброкачественные новообразования ", R.string.icd10_D10_D36),
        ICD10Data("D37-D48","Neoplasms of unknown or unknown nature", "Новообразования неопределенного или неизвестного характера ", R.string.icd10_D37_D48)
)

val deseases3 = listOf(
        ICD10Data("D50-D53","Nutritional Anemias", "Анемии, связанные с питанием ", R.string.icd10_D50_D53),
        ICD10Data("D55-D59","Hemolytic anemias", "Гемолитические анемии ", R.string.icd10_D55_D59),
        ICD10Data("D60-D64","Aplastic and other anemias", "Апластические и другие анемии ", R.string.icd10_D60_D64),
        ICD10Data("D65-D69","Blood clotting disorders, purpura and other hemorrhagic conditions", "Нарушения свертываемости крови, пурпура и другие геморр", R.string.icd10_D65_D69),
        ICD10Data("D70-D77","Other diseases of the blood and blood-forming organs", "Другие болезни крови и кроветворных органов ", R.string.icd10_D70_D77),
        ICD10Data("D80-D89","Selected disorders involving the immune mechanism", "Отдельные нарушения, вовлекающие иммунный механизм ", R.string.icd10_D80_D89)
)

val deseases4 = listOf(
        ICD10Data("E00-E07","Thyroid diseases", "Болезни щитовидной железы ", R.string.icd10_E00_E07),
        ICD10Data("E10-E14","Diabetes mellitus", "Сахарный диабет ", R.string.icd10_E10_E14),
        ICD10Data("E15-E16","Other disorders of glucose regulation and pancreatic endocrine secretion", "Другие нарушения регуляции глюкозы и внутренней секреции поджелудочной железы ", R.string.icd10_E15_E16),
        ICD10Data("E20-E35","Disorders of other endocrine glands", "Нарушения других эндокринных желез ", R.string.icd10_E20_E35),
        ICD10Data("E40-E46","Insufficient power", "Недостаточность питания ", R.string.icd10_E40_E46),
        ICD10Data("E50-E64","Other types of malnutrition", "Другие виды недостаточности питания ", R.string.icd10_E50_E64),
        ICD10Data("E65-E68","Obesity and other types of excess nutrition", "Ожирение и другие виды избыточности питания ", R.string.icd10_E65_E68),
        ICD10Data("E70-E90","Metabolic Disorders", "Нарушения обмена веществ ", R.string.icd10_E70_E90)
)

val deseases5 = listOf(
        ICD10Data("F00-F09","Organic, including symptomatic, mental disorders", "Органические, включая симптоматические, психические расстройства ", R.string.icd10_F00_F09),
        ICD10Data("F10-F19","Substance use mental and behavioral disorders", "Психические расстройства и расстройства поведения, связанные с употреблением психоактивных веществ ", R.string.icd10_F10_F19),
        ICD10Data("F20-F29","Schizophrenia, schizotypal and delusional disorders", "Шизофрения, шизотипические и бредовые расстройства ", R.string.icd10_F20_F29),
        ICD10Data("F30-F39","Mood disorders [mood disorders]", "Расстройства настроения [аффективные расстройства] ", R.string.icd10_F30_F39),
        ICD10Data("F40-F48","Stress-related neurotic and somatoform disorders", "Невротические, связанные со стессом, и соматоформные расстройства ", R.string.icd10_F40_F48),
        ICD10Data("F50-F59","Behavioral syndromes associated with physiological disorders and physical factors", "Поведенческие синдромы, связанные с физиологическими нарушениями и физическими факторами ", R.string.icd10_F50_F59),
        ICD10Data("F60-F69","Adult personality and behavior disorders", "Расстройства личности и поведения в зрелом возрасте ", R.string.icd10_F60_F69),
        ICD10Data("F70-F79","Intellectual disability", "Умственная отсталость ", R.string.icd10_F70_F79),
        ICD10Data("F80-F89","Developmental Disorders", "Расстройства психологического развития ", R.string.icd10_F80_F89),
        ICD10Data("F90-F98","Emotional disorders, conduct disorders, usually onset in childhood and adolescence", "Эмоциональные расстройства, расстройства поведения, обычно начинающиеся в детском и подростковом возрасте ", R.string.icd10_F90_F98),
        ICD10Data("F99-F99","Unspecified mental disorder", "Неуточненные психические расстройства ", R.string.icd10_F99_F99)
)

val deseases6 = listOf(
        ICD10Data("G00-G09","Central Nervous System Inflammatory Diseases", "Воспалительные болезни центральной нервной ситемы ", R.string.icd10_G00_G09),
        ICD10Data("G10-G14","Systemic atrophies predominantly affecting the central nervous system", "Системные атрофии, поражающие преимущественно центральную нервную систему ", R.string.icd10_G10_G14),
        ICD10Data("G20-G26","Extrapyramidal and other movement disorders", "Экстрапирамидные и другие двигательные нарушения ", R.string.icd10_G20_G26),
        ICD10Data("G30-G32","Other degenerative diseases of the central nervous system", "Другие дегенеративные болезни центральной нервной системы ", R.string.icd10_G30_G32),
        ICD10Data("G35-G37","Demyelinating diseases of the central nervous system", "Демиелинизирующие болезни центральной нервной системы ", R.string.icd10_G35_G37),
        ICD10Data("G40-G47","Episodic and paroxysmal disorders", "Эпизодические и пароксизмальные расстройства ", R.string.icd10_G40_G47),
        ICD10Data("G50-G59","Disorders of individual nerves, nerve roots and plexuses", "Поражения отдельных нервов, нервных корешков и сплетений ", R.string.icd10_G50_G59),
        ICD10Data("G60-G64","Polyneuropathies and other lesions of the peripheral nervous system", "Полиневропатии и другие поражения периферической нервной системы ", R.string.icd10_G60_G64),
        ICD10Data("G70-G73","Diseases of the neuromuscular synapse and muscles", "Болезни нервно-мышечного синапса и мышц ", R.string.icd10_G70_G73),
        ICD10Data("G80-G83","Cerebral palsy and other paralytic syndromes", "Церебральный паралич и другие паралитические синдромы ", R.string.icd10_G80_G83),
        ICD10Data("G90-G99","Other disorders of the nervous system", "Другие нарушения нервной системы ", R.string.icd10_G90_G99)
)

val deseases7 = listOf(
        ICD10Data("H00-H06","Diseases of the eyelids, lacrimal ducts and orbits", "Болезни век, слезных путей и глазницы ", R.string.icd10_H00_H06),
        ICD10Data("H10-H13","Conjunctival diseases", "Болезни конъюнктивы ", R.string.icd10_H10_H13),
        ICD10Data("H15-H22","Diseases of the sclera, cornea, iris and ciliary body", "Болезни склеры, роговицы, радужной оболочки и цилиарного тела ", R.string.icd10_H15_H22),
        ICD10Data("H25-H28","Lens diseases", "Болезни хрусталика ", R.string.icd10_H25_H28),
        ICD10Data("H30-H36","Diseases of the choroid and retina", "Болезни сосудистой оболочки и сетчатки ", R.string.icd10_H30_H36),
        ICD10Data("H40-H42","Glaucoma", "Глаукома ", R.string.icd10_H40_H42),
        ICD10Data("H43-H45","Diseases of the vitreous humor and eyeball", "Болезни стекловидного тела и глазного яблока ", R.string.icd10_H43_H45),
        ICD10Data("H46-H48","Diseases of the optic nerve and optic pathways", "Болезни зрительного нерва и зрительных путей ", R.string.icd10_H46_H48),
        ICD10Data("H49-H52","Diseases of the eye muscles, disorders of friendly eye movement, accommodation and refraction", "Болезни мышц глаза, нарушения содружественного движения глаз, аккомодации и рефракции ", R.string.icd10_H49_H52),
        ICD10Data("H53-H54","Visual impairment and blindness", "Зрительные расстройства и слепота ", R.string.icd10_H53_H54),
        ICD10Data("H55-H59","Other diseases of the eye and its adnexa", "Другие болезни глаза и его придаточного аппарата ", R.string.icd10_H55_H59)
)

val deseases8 = listOf(
        ICD10Data("H60-H62","Diseases of the outer ear", "Болезни наружного уха", R.string.icd10_H60_H62),
        ICD10Data("H65-H75","Diseases of the middle ear and mastoid", "Болезни среднего уха и сосцевидного отростка", R.string.icd10_H65_H75),
        ICD10Data("H80-H83","Diseases of the inner ear", "Болезни внутреннего уха", R.string.icd10_H80_H83),
        ICD10Data("H90-H95","Other ear diseases", "Другие болезни уха", R.string.icd10_H90_H95)
)

val deseases9 = listOf(
        ICD10Data("I00-I02","Acute rheumatic fever", "Острая ревматическая лихорадка ", R.string.icd10_I00_I02),
        ICD10Data("I05-I09","Chronic rheumatic heart disease", "Хронические ревматические болезни сердца ", R.string.icd10_I05_I09),
        ICD10Data("I10-I15","Diseases characterized by high blood pressure", "Болезни, характеризующиеся повышенным кровяным давлением ", R.string.icd10_I10_I15),
        ICD10Data("I20-I25","Ischemic heart disease", "Ишемическая болезнь сердца ", R.string.icd10_I20_I25),
        ICD10Data("I26-I28","Cor pulmonale and pulmonary circulation disorders", "Легочное сердце и нарушения легочного кровообращения ", R.string.icd10_I26_I28),
        ICD10Data("I30-I52","Other heart diseases", "Другие болезни сердца ", R.string.icd10_I30_I52),
        ICD10Data("I60-I69","Cerebrovascular diseases", "Цереброваскулярные болезни ", R.string.icd10_I60_I69),
        ICD10Data("I70-I79","Diseases of arteries, arterioles and capillaries", "Болезни артерий, артериол и капилляров ", R.string.icd10_I70_I79),
        ICD10Data("I80-I89","Diseases of veins, lymphatic vessels and lymph nodes, not elsewhere classified", "Болезни вен, лимфатических сосудов и лимфатических узлов, не классифицированные в других рубриках ", R.string.icd10_I80_I89),
        ICD10Data("I95-I99","Other and unspecified diseases of the circulatory system", "Другие и неуточненные болезни системы кровообращения ", R.string.icd10_I95_I99)
)

val deseases10 = listOf(
        ICD10Data("J00-J06","Acute upper respiratory tract infections", "Острые респираторные инфекции верхних дыхательных путей ", R.string.icd10_J00_J06),
        ICD10Data("J09-J18","Influenza and pneumonia", "Грипп и пневмония ", R.string.icd10_J09_J18),
        ICD10Data("J20-J22","Other acute lower respiratory tract infections", "Другие острые респираторные инфекции нижних дыхательных путей ", R.string.icd10_J20_J22),
        ICD10Data("J30-J39","Other upper respiratory diseases", "Другие болезни верхних дыхательных путей ", R.string.icd10_J30_J39),
        ICD10Data("J40-J47","Chronic Lower Respiratory Disorders", "Хронические болезни нижних дыхательных путей ", R.string.icd10_J40_J47),
        ICD10Data("J60-J70","Lung diseases caused by external agents", "Болезни легкого, вызванные внешними агентами ", R.string.icd10_J60_J70),
        ICD10Data("J80-J84","Other respiratory diseases primarily affecting interstitial tissue", "Другие респираторные болезни, поражающие главным образом интерстициальную ткань ", R.string.icd10_J80_J84),
        ICD10Data("J85-J86","Purulent and necrotic conditions of the lower respiratory tract", "Гнойные и некротические состояния нижних дыхательных путей ", R.string.icd10_J85_J86),
        ICD10Data("J90-J94","Other pleural diseases", "Другие болезни плевры ", R.string.icd10_J90_J94),
        ICD10Data("J95-J99","Other respiratory diseases", "Другие болезни органов дыхания ", R.string.icd10_J95_J99)
)

val deseases11 = listOf(
        ICD10Data("K00-K14","Diseases of the oral cavity, salivary glands and jaws", "Болезни полости рта, слюнных желез и челюстей ", R.string.icd10_K00_K14),
        ICD10Data("K20-K31","Diseases of the esophagus, stomach and duodenum", "Болезни пищевода, желудка и двенадцатиперстной кишки ", R.string.icd10_K20_K31),
        ICD10Data("K35-K38","Diseases of the appendix [appendix]", "Болезни аппендикса [червеобразного отростка] ", R.string.icd10_K35_K38),
        ICD10Data("K40-K46","Hernias", "Грыжи ", R.string.icd10_K40_K46),
        ICD10Data("K50-K52","Non-infectious enteritis and colitis", "Неинфекционные энтериты и колиты ", R.string.icd10_K50_K52),
        ICD10Data("K55-K64","Other bowel diseases", "Другие болезни кишечника ", R.string.icd10_K55_K64),
        ICD10Data("K65-K67","Peritoneal diseases", "Болезни брюшины ", R.string.icd10_K65_K67),
        ICD10Data("K70-K77","Liver Diseases", "Болезни печени ", R.string.icd10_K70_K77),
        ICD10Data("K80-K87","Diseases of the gallbladder, biliary tract and pancreas", "Болезни желчного пузыря, желчевыводящих путей и поджелудочной железы ", R.string.icd10_K80_K87),
        ICD10Data("K90-K93","Other diseases of the digestive system", "Другие болезни органов пищеварения ", R.string.icd10_K90_K93)
)

val deseases12 = listOf(
        ICD10Data("L00-L08","Infections of the skin and subcutaneous tissue", "Инфекции кожи и подкожной клетчатки ", R.string.icd10_L00_L08),
        ICD10Data("L10-L14","Bullous violations", "Буллезные нарушения ", R.string.icd10_L10_L14),
        ICD10Data("L20-L30","Dermatitis and eczema", "Дерматит и экзема ", R.string.icd10_L20_L30),
        ICD10Data("L40-L45","Papulosquamous disorders", "Папулосквамозные нарушения ", R.string.icd10_L40_L45),
        ICD10Data("L50-L54","Urticaria and erythema", "Крапивница и эритема ", R.string.icd10_L50_L54),
        ICD10Data("L55-L59","Diseases of the skin and subcutaneous tissue associated with radiation", "Болезни кожи и подкожной клетчатки, связанные с излучением ", R.string.icd10_L55_L59),
        ICD10Data("L60-L75","Diseases of the skin appendages", "Болезни придатков кожи ", R.string.icd10_L60_L75),
        ICD10Data("L80-L99","Other diseases of the skin and subcutaneous tissue", "Другие болезни кожи и подкожной клетчатки ", R.string.icd10_L80_L99)
)

val deseases13 = listOf(
        ICD10Data("M00-M03","Infectious arthropathies", "Инфекционные артропатии ", R.string.icd10_M00_M03),
        ICD10Data("M05-M14","Inflammatory polyarthropathies", "Воспалительные полиартропатии ", R.string.icd10_M05_M14),
        ICD10Data("M15-M19","Arthrosis", "Артрозы ", R.string.icd10_M15_M19),
        ICD10Data("M20-M25","Other joint lesions", "Другие поражения суставов ", R.string.icd10_M20_M25),
        ICD10Data("M30-M36","Systemic connective tissue lesions", "Системные поражения соединительной ткани ", R.string.icd10_M30_M36),
        ICD10Data("M40-M43","Deforming dorsopathies", "Деформирующие дорсопатии ", R.string.icd10_M40_M43),
        ICD10Data("M50-M54","Other dorsopathies", "Другие дорсопатии ", R.string.icd10_M50_M54),
        ICD10Data("M60-M63","Muscle lesions", "Поражения мышц ", R.string.icd10_M60_M63),
        ICD10Data("M65-M68","Lesions of synovial membranes and tendons", "Поражения синовиальных оболочек и сухожилий ", R.string.icd10_M65_M68),
        ICD10Data("M70-M79","Other soft tissue lesions", "Другие поражения мягких тканей ", R.string.icd10_M70_M79),
        ICD10Data("M80-M85","Abnormalities in bone density and structure", "Нарушения плотности и структуры кости ", R.string.icd10_M80_M85),
        ICD10Data("M86-M90","Other osteopathies", "Другие остеопатии ", R.string.icd10_M86_M90),
        ICD10Data("M91-M94","Chondropathy", "Хондропатии ", R.string.icd10_M91_M94),
        ICD10Data("M95-M99","Other disorders of the musculoskeletal system and connective tissue", "Другие нарушения костно-мышечной системы и соединительной ткани ", R.string.icd10_M95_M99)
)

val deseases14 = listOf(
        ICD10Data("N00-N08","Glomerular diseases", "Гломерулярные болезни ", R.string.icd10_N00_N08),
        ICD10Data("N10-N16","Tubulointerstitial Kidney Disease", "Тубулоинтерстициальные болезни почек ", R.string.icd10_N10_N16),
        ICD10Data("N17-N19","Renal failure", "Почечная недостаточность ", R.string.icd10_N17_N19),
        ICD10Data("N20-N23","Urolithiasis", "Мочекаменная болезнь ", R.string.icd10_N20_N23),
        ICD10Data("N25-N29","Other kidney and ureter diseases", "Другие болезни почки и мочеточника ", R.string.icd10_N25_N29),
        ICD10Data("N30-N39","Other diseases of the urinary system", "Другие болезни мочевыделительной системы ", R.string.icd10_N30_N39),
        ICD10Data("N40-N51","Diseases of the male genital organs", "Болезни мужских половых органов ", R.string.icd10_N40_N51),
        ICD10Data("N60-N64","Breast diseases", "Болезни молочной железы ", R.string.icd10_N60_N64),
        ICD10Data("N70-N77","Female Pelvic Inflammatory Diseases", "Воспалительные болезни женских тазовых органов ", R.string.icd10_N70_N77),
        ICD10Data("N80-N98","Non-inflammatory diseases of female genital organs", "Невоспалительные болезни женских половых органов ", R.string.icd10_N80_N98),
        ICD10Data("N99-N99","Other disorders of the genitourinary system", "Другие нарушения мочеполовой системы ", R.string.icd10_N99_N99)
)

val deseases15 = listOf(
        ICD10Data("O00-O08","Abortion pregnancy", "Беременность с абортивным исходом ", R.string.icd10_O00_O08),
        ICD10Data("O10-O16","Edema, proteinuria and hypertensive disorders during pregnancy, childbirth and the puerperium", "Отеки, протеинурия и гипертензивные расстройства во время беременности, родов и в послеродовом периоде ", R.string.icd10_O10_O16),
        ICD10Data("O20-O29","Other diseases of the mother, mainly associated with pregnancy", "Другие болезни матери, преимущественно связанные с беременностью ", R.string.icd10_O20_O29),
        ICD10Data("O30-O48","Medical care for the mother in connection with the condition of the fetus, amniotic cavity and possible difficulties in delivery", "Медицинская помощь матери в связи с состоянием плода, амниотической полости и возможными трудностями родоразрешения ", R.string.icd10_O30_O48),
        ICD10Data("O60-O75","Complications of labor and delivery", "Осложнения родов и родоразрешения ", R.string.icd10_O60_O75),
        ICD10Data("O80-O84","Delivery", "Родоразрешение ", R.string.icd10_O80_O84),
        ICD10Data("O85-O92","Complications mainly related to the puerperium", "Осложнения, связанные преимущественно с послеродовым периодом ", R.string.icd10_O85_O92),
        ICD10Data("O94-O99","Other obstetric conditions not elsewhere classified", "Другие акушерские состояния, не классифицированные в других рубриках ", R.string.icd10_O94_O99)
)

val deseases16 = listOf(
        ICD10Data("P00-P04","Damage to the fetus and newborn due to maternal conditions, complications of pregnancy, childbirth and delivery", "Поражение плода и новорожденного, обусловленные состояниями матери, осложнениями беременности, родов и родоразрешения ", R.string.icd10_P00_P04),
        ICD10Data("P05-P08","Disorders related to length of pregnancy and fetal growth", "Расстройства, связанные с продолжительностью беременности и ростом плода ", R.string.icd10_P05_P08),
        ICD10Data("P10-P15","Birth trauma", "Родовая травма ", R.string.icd10_P10_P15),
        ICD10Data("P20-P29","Respiratory and cardiovascular disorders typical of the perinatal period", "Дыхательные и сердечно-сосудистые нарушения, характерные для перинатального периода ", R.string.icd10_P20_P29),
        ICD10Data("P35-P39","Perinatal Specific Infectious Diseases", "Инфекционные болезни, специфичные для перинатального периода ", R.string.icd10_P35_P39),
        ICD10Data("P50-P61","Hemorrhagic and hematological disorders in the fetus and newborn", "Геморрагические и гематологические нарушения у плода и новорожденного ", R.string.icd10_P50_P61),
        ICD10Data("P70-P74","Transient endocrine and metabolic disorders specific to the fetus and newborn", "Преходящие эндокринные нарушения и нарушения обмена веществ, специфические для плода и новорожденного ", R.string.icd10_P70_P74),
        ICD10Data("P75-P78","Fetus and newborn digestive system disorders", "Расстройства системы пищеварения у плода и новорожденного ", R.string.icd10_P75_P78),
        ICD10Data("P80-P83","Conditions affecting the skin and thermoregulation of the fetus and newborn", "Состояния, затрагивающие кожные покровы и терморегуляцию у плода и новорожденного ", R.string.icd10_P80_P83),
        ICD10Data("P90-P96","Other disorders occurring in the perinatal period", "Другие нарушения, возникающие в перинатальном периоде ", R.string.icd10_P90_P96)
)

val deseases17 = listOf(
        ICD10Data("Q00-Q07","Congenital malformations of the nervous system", "Врожденные аномалии развития нервной системы ", R.string.icd10_Q00_Q07),
        ICD10Data("Q10-Q18","Congenital anomalies of the eye, ear, face and neck", "Врожденные аномалии глаза, уха, лица и шеи ", R.string.icd10_Q10_Q18),
        ICD10Data("Q20-Q28","Congenital anomalies of the circulatory system", "Врожденные аномалии системы кровообращения ", R.string.icd10_Q20_Q28),
        ICD10Data("Q30-Q34","Congenital anomalies of the respiratory system", "Врожденные аномалии органов дыхания ", R.string.icd10_Q30_Q34),
        ICD10Data("Q35-Q37","Cleft lip and palate [cleft lip and cleft palate]", "Расщелина губы и неба [заячья губа и волчья пасть] ", R.string.icd10_Q35_Q37),
        ICD10Data("Q38-Q45","Other congenital malformations of the digestive system", "Другие врожденные аномалии органов пищеварения ", R.string.icd10_Q38_Q45),
        ICD10Data("Q50-Q56","Congenital genital anomalies", "Врожденные аномалии половых органов ", R.string.icd10_Q50_Q56),
        ICD10Data("Q60-Q64","Congenital anomalies of the urinary system", "Врожденные аномалии мочевыделительной системы ", R.string.icd10_Q60_Q64),
        ICD10Data("Q65-Q79","Congenital anomalies and deformities of the musculoskeletal system", "Врожденные аномалии и деформации костно-мышечной системы ", R.string.icd10_Q65_Q79),
        ICD10Data("Q80-Q89","Other congenital anomalies", "Другие врожденные аномалии ", R.string.icd10_Q80_Q89),
        ICD10Data("Q90-Q99","Chromosomal abnormalities not elsewhere classified", "Хромосомные нарушения, не классифицированные в других рубриках ", R.string.icd10_Q90_Q99)
)

val deseases18 = listOf(
        ICD10Data("R00-R09","Symptoms and signs related to circulatory and respiratory systems", "Симптомы и признаки, относящиеся к системам кровообращения и дыхания", R.string.icd10_R00_R09),
        ICD10Data("R10-R19","Symptoms and signs related to the digestive and abdominal systems", "Симптомы и признаки, относящиеся к системам пищеварения и брюшной полости", R.string.icd10_R10_R19),
        ICD10Data("R20-R23","Symptoms and signs involving the skin and subcutaneous tissue", "Симптомы и признаки, относящиеся к коже и подкожной клетчатке", R.string.icd10_R20_R23),
        ICD10Data("R25-R29","Symptoms and signs related to the nervous and musculoskeletal systems", "Симптомы и признаки, относящиеся к нервной и костно-мышечной системам", R.string.icd10_R25_R29),
        ICD10Data("R30-R39","Symptoms and signs related to the urinary system", "Симптомы и признаки, относящиеся к мочевой системе", R.string.icd10_R30_R39),
        ICD10Data("R40-R46","Symptoms and signs related to cognition, perception, emotional state and behavior", "Симптомы и признаки, относящиеся к познавательной способности, восприятию, эмоциональному состоянию и поведению", R.string.icd10_R40_R46),
        ICD10Data("R47-R49","Symptoms and signs related to speech and voice", "Симптомы и признаки, относящиеся к речи и голосу", R.string.icd10_R47_R49),
        ICD10Data("R50-R69","General symptoms and signs", "Общие симптомы и признаки", R.string.icd10_R50_R69),
        ICD10Data("R70-R79","Abnormalities detected during blood tests without diagnosis", "Отклонения от нормы, выявленные при исследовании крови, при отсутствии диагноза", R.string.icd10_R70_R79),
        ICD10Data("R80-R82","Abnormalities detected in urine analysis without diagnosis", "Отклонения от нормы, выявленные при исследовании мочи, при отсутствии диагноза", R.string.icd10_R80_R82),
        ICD10Data("R83-R89","Abnormalities detected in the study of other body fluids, substances and tissues, in the absence of a diagnosis", "Отклонения от нормы, выявленные при исследовании других жидкостей, субстанций и тканей организма, при отсутствии диагноза", R.string.icd10_R83_R89),
        ICD10Data("R90-R94","Abnormalities found in diagnostic imaging and functional studies without diagnosis", "Отклонения от нормы, выявленные при диагностических исследованиях с получением изображений и функциональных исследованиях, при отсутствии диагноза", R.string.icd10_R90_R94),
        ICD10Data("R95-R99","Inaccurate and unknown causes of death", "Неточно обозначенные и неизвестные причины смерти", R.string.icd10_R95_R99)
)

val deseases19 = listOf(
        ICD10Data("S00-S09","Head Injury", "Травмы головы ", R.string.icd10_S00_S09),
        ICD10Data("S10-S19","Neck Injuries", "Травмы шеи ", R.string.icd10_S10_S19),
        ICD10Data("S20-S29","Chest Injury", "Травмы грудной клетки ", R.string.icd10_S20_S29),
        ICD10Data("S30-S39","Injuries to the abdomen, lower back, lumbar spine and pelvis", "Травмы живота, нижней части спины, поясничного отдела позвоночника и таза ", R.string.icd10_S30_S39),
        ICD10Data("S40-S49","Shoulder girdle and shoulder injuries", "Травмы плечевого пояса и плеча ", R.string.icd10_S40_S49),
        ICD10Data("S50-S59","Elbow and forearm injuries", "Травмы локтя и предплечья ", R.string.icd10_S50_S59),
        ICD10Data("S60-S69","Wrist and hand injuries", "Травмы запястья и кисти ", R.string.icd10_S60_S69),
        ICD10Data("S70-S79","Hip and thigh injuries", "Травмы области тазобедренного сустава и бедра ", R.string.icd10_S70_S79),
        ICD10Data("S80-S89","Knee and shin injuries", "Травмы колена и голени ", R.string.icd10_S80_S89),
        ICD10Data("S90-S99","Ankle and foot injuries", "Травмы области голеностопного сустава и стопы ", R.string.icd10_S90_S99),
        ICD10Data("T00-T07","Injuries involving multiple areas of the body", "Травмы, захватывающие несколько областей тела ", R.string.icd10_T00_T07),
        ICD10Data("T08-T14","Injury to an unspecified trunk, limb, or body region", "Травмы неуточненной части туловища, конечности или области тела ", R.string.icd10_T08_T14),
        ICD10Data("T15-T19","Consequences of foreign body penetration through natural holes", "Последствия проникновения инородного тела через естественные отверстия ", R.string.icd10_T15_T19),
        ICD10Data("T20-T25","Thermal and chemical burns of the outer surfaces of the body, specified by their location", "Термические и химические ожоги наружных поверхностей тела, уточненные по их локализации ", R.string.icd10_T20_T25),
        ICD10Data("T26-T28","Thermal and chemical burns of the eye and internal organs", "Термические и химические ожоги глаза и внутренних органов ", R.string.icd10_T26_T28),
        ICD10Data("T29-T32","Thermal and chemical burns of multiple and unspecified body parts", "Термические и химические ожоги множественной и неуточненной части тела ", R.string.icd10_T29_T32),
        ICD10Data("T33-T35","Frostbite", "Отморожение ", R.string.icd10_T33_T35),
        ICD10Data("T36-T50","Poisoning by drugs, medicines and biological substances", "Отравления лекарственными средствами, медикаментами и биологическими веществами ", R.string.icd10_T36_T50),
        ICD10Data("T51-T65","Toxic effect of substances, mainly non-medical", "Токсическое действие веществ, преимущественно немедицинского назначения ", R.string.icd10_T51_T65),
        ICD10Data("T66-T78","Other and unspecified external causes", "Другие и неуточненные эффекты воздействия внешних причин ", R.string.icd10_T66_T78),
        ICD10Data("T79-T79","Some early complications of trauma", "Некоторые ранние осложнения травмы ", R.string.icd10_T79_T79),
        ICD10Data("T80-T88","Surgical and therapeutic complications not elsewhere classified", "Осложнения хирургических и терапевтических вмешательств, не классифицированные в других рубриках ", R.string.icd10_T80_T88),
        ICD10Data("T90-T98","Consequences of injuries, poisoning and other influences of external causes", "Последствия травм, отравлений и других воздействий внешних причин ", R.string.icd10_T90_T98)
)

val deseases20 = listOf(
        ICD10Data("V01-V09","Pedestrian injured in traffic accident", "Пешеход, пострадавший в результате транспортного несчастного случая ", R.string.icd10_V01_V09),
        ICD10Data("V10-V19","Cyclist injured in transport accident", "Велосипедист, пострадавший в результате транспортного несчастного случая ", R.string.icd10_V10_V19),
        ICD10Data("V20-V29","Motorcyclist injured in transport accident", "Мотоциклист, пострадавший в результате транспортного несчастного случая ", R.string.icd10_V20_V29),
        ICD10Data("V30-V39","A person who was in a three-wheeled vehicle and was injured in a transport accident", "Лицо, находившееся в трехколесном транспортном средстве и пострадавшее в результате транспортного несчастного случая ", R.string.icd10_V30_V39),
        ICD10Data("V40-V49","A person in a car and injured in a transport accident", "Лицо, находившееся в легковом автомобиле и пострадавшее в результате транспортного несчастного случая ", R.string.icd10_V40_V49),
        ICD10Data("V50-V59","A person who was in a pickup truck or van and was injured in a transport accident", "Лицо, находившееся в грузовом автомобиле типа пикап или фургоне и пострадавшее в результате транспортного несчастного случая ", R.string.icd10_V50_V59),
        ICD10Data("V60-V69","A person who was in a heavy truck and injured in a transport accident", "Лицо, находившееся в тяжелом грузовом автомобиле и пострадавшее в результате транспортного несчастного случая ", R.string.icd10_V60_V69),
        ICD10Data("V70-V79","Person on the bus and injured in a transport accident", "Лицо, находившееся в автобусе и пострадавшее в результате транспортного несчастного случая ", R.string.icd10_V70_V79),
        ICD10Data("V80-V89","Accidents involving other ground vehicles", "Несчастные случаи, связанные с другими наземными транспортными средствами ", R.string.icd10_V80_V89),
        ICD10Data("V90-V94","Accidents in water transport", "Несчастные случаи на водном транспорте ", R.string.icd10_V90_V94),
        ICD10Data("V95-V97","Air and space accidents", "Несчастные случаи на воздушном транспорте и при космических полетах ", R.string.icd10_V95_V97),
        ICD10Data("V98-V99","Other and unspecified traffic accidents", "Другие и неуточненные транспортные несчастные случаи ", R.string.icd10_V98_V99),
        ICD10Data("W00-W19","Crashes", "Падения ", R.string.icd10_W00_W19),
        ICD10Data("W20-W49","Impact of inanimate mechanical forces", "Воздействие неживых механических сил ", R.string.icd10_W20_W49),
        ICD10Data("W50-W64","Impact of living mechanical forces", "Воздействие живых механических сил ", R.string.icd10_W50_W64),
        ICD10Data("W65-W74","Accidental drowning or submersion", "Случайное утопление или погружение в воду ", R.string.icd10_W65_W74),
        ICD10Data("W75-W84","Other Respiratory Threat Accidents", "Другие несчастные случаи с угрозой дыханию ", R.string.icd10_W75_W84),
        ICD10Data("W85-W99","Accidents caused by electric current, radiation and extremes of ambient temperature and pressure levels", "Несчастные случаи, вызванные воздействием электрического тока, излучения и крайних значений уровней температуры окружающей среды и атмосферного давления ", R.string.icd10_W85_W99),
        ICD10Data("X00-X09","Impact of smoke, fire and flames", "Воздействие дыма, огня и пламени ", R.string.icd10_X00_X09),
        ICD10Data("X10-X19","Contact with hot and hot substances (objects)", "Соприкосновение с горячими и раскаленными веществами (предметами) ", R.string.icd10_X10_X19),
        ICD10Data("X20-X29","Contact with poisonous animals and plants", "Контакт с ядовитыми животными и растениями ", R.string.icd10_X20_X29),
        ICD10Data("X30-X39","Influence of the forces of nature", "Воздействие сил природы ", R.string.icd10_X30_X39),
        ICD10Data("X40-X49","Accidental poisoning and exposure to poisonous substances", "Случайное отравление и воздействие ядовитыми веществами ", R.string.icd10_X40_X49),
        ICD10Data("X50-X57","Overvoltage, travel and deprivation", "Перенапряжение, путешествия и лишения ", R.string.icd10_X50_X57),
        ICD10Data("X58-X59","Accidental effects of other and unspecified factors", "Случайное воздействие других и неуточненных факторов ", R.string.icd10_X58_X59),
        ICD10Data("X60-X84","Intentional self-harm", "Преднамеренное самоповреждение ", R.string.icd10_X60_X84),
        ICD10Data("X85-Y09","Attack", "Нападение ", R.string.icd10_X85_Y09),
        ICD10Data("Y10-Y34","Damage with undefined intent", "Повреждение с неопределенными намерениями ", R.string.icd10_Y10_Y34),
        ICD10Data("Y35-Y36","Legal and military operations", "Действия, предусмотренные законом, и военные операции ", R.string.icd10_Y35_Y36),
        ICD10Data("Y40-Y59","Medicines, medicines and biological substances that cause adverse reactions in their therapeutic use", "Лекарственные средства, медикаменты и биологические вещества, являющиеся причиной неблагоприятных реакций при их терапевтическом применении ", R.string.icd10_Y40_Y59),
        ICD10Data("Y60-Y69","Accidental harm to a patient while performing therapeutic (and surgical) interventions", "Случайное нанесение вреда больному при выполнении терапевтических (и хирургических) вмешательств ", R.string.icd10_Y60_Y69),
        ICD10Data("Y70-Y82","Medical devices and devices with which accidents are associated with their use for diagnostic and therapeutic purposes", "Медицинские приборы и устройства, с которыми связаны несчастные случаи, возникшие при их использовании для диагностических и терапевтических целей ", R.string.icd10_Y70_Y82),
        ICD10Data("Y83-Y84","Surgical and other medical procedures as the cause of an abnormal reaction or late complication in a patient without mention of accidental harm during the course of the procedure", "Хирургические и другие медицинские процедуры как причина анормальной реакции или позднего осложнения у пациента без упоминания о случайном нанесении ему вреда во время их выполнения ", R.string.icd10_Y83_Y84),
        ICD10Data("Y85-Y89","Impact of external causes of morbidity and mortality", "Последствия воздействия внешних причин заболеваемости и смертности ", R.string.icd10_Y85_Y89),
        ICD10Data("Y90-Y98","Additional factors related to morbidity and mortality classified elsewhere", "Дополнительные факторы, имеющие отношение к заболеваемости и смертности, классифицированным в других рубриках ", R.string.icd10_Y90_Y98)
)

val deseases21 = listOf(
        ICD10Data("Z00-Z13","Appeals to healthcare institutions for medical examination and examination", "Обращения в учреждения здравоохранения для медицинского осмотра и обследования ", R.string.icd10_Z00_Z13),
        ICD10Data("Z20-Z29","Potential health hazard associated with infectious diseases", "Потенциальная опасность для здоровья, связанная с инфекционными болезнями ", R.string.icd10_Z20_Z29),
        ICD10Data("Z30-Z39","Appeals to health care facilities due to circumstances related to reproductive function", "Обращения в учреждения здравоохранения в связи с обстоятельствами, относящимися к репродуктивной функции ", R.string.icd10_Z30_Z39),
        ICD10Data("Z40-Z54","Appeals to healthcare institutions in connection with the need for specific procedures and medical assistance", "Обращения в учреждения здравоохранения в связи с необходимостью проведения специфических процедур и получения медицинской помощи ", R.string.icd10_Z40_Z54),
        ICD10Data("Z55-Z65","Potential health hazards related to socioeconomic and psychosocial circumstances", "Потенциальная опасность для здоровья, связанная с социально-экономическими и психосоциальными обстоятельствами ", R.string.icd10_Z55_Z65),
        ICD10Data("Z70-Z76","Appeals to healthcare facilities due to other circumstances", "Обращения в учреждения здравоохранения в связи с другими обстоятельствами ", R.string.icd10_Z70_Z76),
        ICD10Data("Z80-Z99","Potential health hazard related to personal or family history and certain health circumstances", "Потенциальная опасность для здоровья, связанная с личным или семейным анамнезом и определенными обстоятельствами, влияющими на здоровье ", R.string.icd10_Z80_Z99)
)

val deseases22 = listOf(
        ICD10Data("U00-U49","Temporary designations for new diagnoses of unknown etiology or for use in emergencies", "Временные обозначения новых диагнозов неясной этиологии или для использования в чрезвычайных ситуациях ", R.string.icd10_U00_U49),
        ICD10Data("U82-U85","Antimicrobial and anticancer drug resistance", "Устойчивость к противомикробным и противоопухолевым препаратам ", R.string.icd10_U82_U85)
)