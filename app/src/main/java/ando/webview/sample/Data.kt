package ando.webview.sample

/**
 * @author javakam
 * @date 2021/3/3  16:03
 */

const val localHtmlPath="file:///android_asset/js_video/video.html"
const val localHtmlPath2="file:///android_asset/js_video/video2.html"

// http://vd.zqrb.cn/admin/getvod/getvideo?key=b99dd7e5cfc1dadbb486326c68c8eb42&videoId=098ae9c0336f44f7b0990ea8433f45ff&isRePlay=1&isautoplay=1&id=358
const val videoStr = "<p><script " +
        "src=\\\"http://vd.zqrb.cn/admin/getvod/getvideo?key=b99dd7e5cfc1dadbb486326c68c8eb42&videoId=098ae9c0336f44f7b0990ea8433f45ff&isRePlay=1&isautoplay=1&id=358\\\" " +
        "type=\\\"text/javascript\\\"></script></p><p>（策划 XXX音视频中心）</p>"

const val videoStr2 = "<script type='text/javascript' " +
        "src='http://vd.zqrb.cn/admin/getvod/getvideo?key=b99dd7e5cfc1dadbb486326c68c8eb42&videoId=098ae9c0336f44f7b0990ea8433f45ff&isRePlay=1&isautoplay=1&id=358'></script>"

const val htmlStr =
    "<div><p align=\\\"center\\\"><img alt=\\\"\\\" src=\\\"http://www.cppagy.com/resPath/resKE/images/20200313/1584106729489.jpg\\\" /> " +
            "</p><p>长江少年儿童出版社（集团）有限公司总经理柯尊文(中)在通过线上办公推进出版社工作的同时，还作为下沉党员，配送居民团购物资。长江少年儿童出版社（集团）有限公司 供图</p><br />" +
            "<span style=\\\"line-height:2.5;font-size:16px;\\\"> 自疫情发生以来，长江少年儿童出版社（集团）有限公司（以下简称长少集团）加强领导，周密安排，克服困难，" +
            "积极主动履行社会责任和文化担当。</span><br /><span style=\\\"line-height:2.5;font-size:16px;\\\"> 因身处疫情中心，各方面的工作均受到不同程度的影响，但" +
            "长少集团坚决推进“两手抓”，一手抓抗疫，一手抓发展。自2月3日起，全员进入居家办公状态，以线上办公的形式，推进选题策划、稿件编审、产品宣传、渠道沟通，同时积极调配省外资源，" +
            "推进图书印制、越库发货；充分利用员工隔离在家的时间，组织全员开展网上学习，提升员工政治素养、业务知识和专业技能。</span><br /><span style=\\\"line-height:2;font-size:16px;\\\">" +
            "<span style=\\\"line-height:2.5;\\\"> </span><strong><span style=\\\"line-height:2.5;\\\">一手抓抗疫，一手抓发展</span></strong></span><br />" +
            "<span style=\\\"line-height:2.5;font-size:16px;\\\"> 长少集团在第一时间成立了3个“特别工作组”：一是战“疫”主题出版工作组：策划了《战“疫”书简：致最牵挂的你》《等爸爸回家》" +
            "《妈妈的秘密》《讲给孩子的病毒简史》等多部抗疫主题出版物，歌颂真情、抚慰心灵、普及新知，为读者同舟共济、抗击疫情提供精神文化支持。二是“线上学习”工作组：" +
            "长少集团积极响应国家教育部门2020年春季中小学“停课不停学”号召，在2月1日上线了“长少学习”（小学版）APP，向用户免费投放学习资源及视频直播课。三是战“疫”宣传工作组：弘扬社会主旋律，" +
            "传递抗疫正能量。工作组深入一线，挖掘广大员工坚守岗位、抗击疫情的感人故事和动人瞬间，采写制作文图、音视频近40条，记录下长少人的坚强和坚守。</span><br />" +
            "<span style=\\\"line-height:2;font-size:16px;\\\"><span style=\\\"line-height:2.5;\\\"> </span><strong><span style=\\\"line-height:2.5;\\\">" +
            "对出版行业抗风险能力的思考</span></strong></span><br /><span style=\\\"line-height:2.5;font-size:16px;\\\"> 尽管我们多措并举、积极作为，" +
            "但是生产经营在此次疫情中仍然可能遭受较大损失。总体来看，在疫情面前，出版行业的抗风险能力是脆弱的，这也引发了我们的深度思考。在目前的出版格局下，要积极创新，改变行业生态，着力推进三个转型。" +
            "</span><br /><span style=\\\"line-height:2;font-size:16px;\\\"><span style=\\\"line-height:2.5;\\\"> </span><strong><span style=\\\"line-height:2.5;\\\">" +
            "由“重资产”向“轻资产”转型。</span></strong></span><br /><span style=\\\"line-height:2.5;font-size:16px;\\\"> 虽然出版业不属于典型意义上的重资产行业，但实际运营情况是，" +
            "大量成本投入在图书产品上，而传统意义上委托代销制的销售链拉得过长，市场信息反馈缓慢，资金回笼周期长，一旦有“风吹草动”，往往就可能给出版社带来损失。</span><br />" +
            "<span style=\\\"line-height:2.5;font-size:16px;\\\"> 要改变这种格局，一是要在产品形态上进行创新，除传统纸质出版物之外，开发价值稳定、投入成本低、能持续赢利的产品，" +
            "如比电子书、音频、视频、知识服务产品等；二是要主动调整销售渠道，延伸价值链，缩短销售链，比如扩大大单采购、定向销售的占比，以降低资金占用，提高库存周转率，加快资金回笼，降低风险，" +
            "实现良性运营。</span><br /><span style=\\\"line-height:2;font-size:16px;\\\"><span style=\\\"line-height:2.5;\\\"> </span><strong><span " +
            "style=\\\"line-height:2.5;\\\">由单一性向多元性转型。</span></strong></span><br /><span style=\\\"line-height:2.5;font-size:16px;\\\"> " +
            "目前绝大多数出版社的“生命线”还是传统出版主业，在“互联网+”的时代，并没有构建出适应新的知识传播的新业态。当前数字出版、线上教育等新兴产业生机蓬勃，但作为文化建设引领者之一的出版社，" +
            "大部分只是充当内容提供商，在新形态产品构建、平台打造、推广运营方面，没有形成竞争力。如果不能尽快拥抱互联网，创建“互联网+”业态，出版之路只会越走越窄，前景堪忧。</span><br />" +
            "<span style=\\\"line-height:2;font-size:16px;\\\"><span style=\\\"line-height:2.5;\\\"> </span><strong><span style=\\\"line-height:2.5;\\\">" +
            "由大众化向分众化转型。</span></strong></span><br /><span style=\\\"line-height:2.5;font-size:16px;\\\"> 目前，出版业的主要服务对象，除文教产品外，用户画像不够清晰，" +
            "大而化之是服务大众，但实际上没有精准锁定读者群，因此产品开发、市场投放、渠道建设、营销投入等都带有一定盲目性，存在一定程度上资源浪费的情况，因此精准了解并满足分众需求，是十分迫切的。" +
            "我们要利用大数据分析，建立自己的数据库，把出版工作各个环节纳入数据分析，提高工作精准度，以实现精细化运营，谋求高质量发展。</span> </div>"

const val testArticle =
    "<p>   <font face=\"楷体_GB2312\"> 导读：在历史的长河中，我们一定会记住2018年，这一年资管新规的推出，改变了我国资产管理行业的底层展业逻辑。" +
            "银行、基金、保险、券商等资产管理机构纷纷回归本源，专注于发展各自擅长的资产管理能力。</font></p><p style=\"text-align: center;\">" +
            "<img src=\"http://www.zqrb.cn/2020-04-23/img_8791862955ea15e66a1457.png\" alt=\"1.png\" /></p><p>    与此同时，刚性兑付彻底打破，推动市场无风险收益率持续下行。" +
            "老百姓的投资理财由过去的保本保收益理财向净值型产品转变。长期超额收益显著的公募基金，逐步成为中国家庭资产配置的重要产品。</p><p>    " +
            "在这过程中，什么样的公司更能获得客户的认可，一家好的资产管理公司背后的护城河又是什么？近日，我们有幸访谈了广发基金总经理助理王海涛，和我们分享如何构建具有长期护城河的资产管理公司。</p><p>    " +
            "广发基金的主动权益业务在过去几年发生了一些积极的变化。例如，2019年结构性牛市中，广发基金旗下一批成长风格的基金取得亮眼的成绩，同类排名前5%；" +
            "与此同时，净值波动较小、长期超额收益突出的价值类风格产品也很出色，如傅友兴管理的广发稳健增长，五年累计回报排名同类前10%，回撤水平则排在同类前1%。</p><p>    " +
            "那么，如何构建一家资产管理公司的护城河，为老百姓获取可持续的收益呢？王海涛认为，资产管理作为一个轻资产行业，核心还是要围绕人才和机制。一个科学稳定的投资流程，是投资收益可复制的根源。" +
            "广发基金近年来推进的投研一体化机制、产品风格稳定化改革，正是立足于对行业的深入研究，发挥每个人的能力圈，清晰定义持有人风险偏好，实现产品和用户的更好匹配。</p><p>    " +
            "<strong>护城河：一体化的投研团队</strong></p><p>    朱昂：作为一家资产管理公司，您认为广发基金主动权益业务的护城河是什么？</p><p>    " +
            "王海涛：我个人认为，广发主动权益的护城河是我们投研一体化做得越来越好，转化效率很高，这有助于我们在将来的竞争中保持优势。举个例子，我们的研究团队分为四个组：科技、周期、高端制造和消费。" +
            "过去，研究小组的组长都是资深研究员担任。今年开始，我们进一步加深了投研一体化的建设，把四个投资部门的（价值投资部、成长投资部、策略投资部、专户投资部）负责人派到各研究组担任联席组长，" +
            "让研究与投资结合的更加紧密，研究成果的转换更快。</p><p>    我们构建的联席组长运作机制，就是让投资和研究的协作更加紧密，在基本面研究领域构建认知优势：" +
            "一方面，推动团队对行业长期发展趋势以及公司成长空间进行深度研究，清晰地把握公司中长期的增长点及持续时间；另一方面，让研究更加贴近市场，更深入、更准确地对企业的中长期价值进行定价。</p><p>    " +
            "我们还建立了投研的师徒制模式，每一位投资经验超过三年的资深基金经理带1-2个研究员，半年轮一次，包括我自己在内，我也带了两位研究部的年轻同事。" +
            "一开始，是背景相近的基金经理担任研究员的师傅，半年后我们会轮换到具有不同行业研究背景的基金经理担任导师。轮换两三年后，不仅能拓展研究员的视野，对不同行业的商业模式有更加深入的理解，" +
            "也能够让研究员跳出自己的圈子去进行横向及国际比较，对好的商业模式、好的公司理解得更加深刻。</p><p>    我认为，对于一家资产管理公司来说，投研团队的高效沟通和互相赋能，是一种强大的护城河。" +
            "对广发基金来说，我们的护城河是投研深度绑定，研究贴近于实战：投资和研究基于科学的流程和充分信任形成高效的协作机制，最终转换成可持续的超额收益。</p><p>    " +
            "朱昂：您前面提到了三大权益部门，能否谈谈三大权益部门的定位？</p><p>    王海涛：我们的A股主动权益投资分为三个部门：价值投资、成长投资、策略投资，三大权益部门的定位是“价值为本，成长致远，" +
            "策略多元”。</p><p>    价值为本：资产管理的本质是基于企业的价值进行投资，以此为本，为客户赚钱。“价值为本”既体现我们对客户的态度，也是我们投资理念的基础。" +
            "就如巴菲特所说，成长是价值的一部分，我们的三大权益部门都坚持价值投资，出发点都是找到价值持续增长的好公司，只是在投资方法、投资风格上有所区别。</p><p>    " +
            "成长致远：成长股投资一直是广发基金的传统优势，这种优势不仅仅体现在投资业绩上，也更适合中国经济发展的阶段。相比于发达国家，中国依然是一个高速成长的经济体，不同阶段都涌现了优质的成长型企业。" +
            "成长股投资，需要比较好的眼光，无论是赛道选择，还是个股甄别上如何去伪存真，我们需要看得更远，伴随企业成长，这是我们投资成长股所需要关注的。</p><p>    " +
            "策略多元：从投资角度看，成长和价值更多是风格上的差异，但无法完全涵盖一些更加细分领域的产品类型，比如说一些行业基金。我们会在一些比较重要的行业发挥投资能力，主要包括五大领域：" +
            "与宏观经济相关度比较高的金融和地产；代表中长期优质赛道的消费；受益于长期医疗创新和人口老龄化的医药；在全球产业链中占据重要地位的制造业；代表科技创新的TMT行业等。</p><p>    " +
            "我们要求行业基金的基金经理要做行业的专家，一方面给客户提供风格明晰的资产配置工具；另一方面也要为全市场基金提供更加专业的判断，包括行业趋势和投资标的等。</p><p>    " +
            "<strong>风格多元化：在同类基金做出Alpha</strong></p><p>    朱昂：产品风格漂移是过去几年基金行业曾经存在的问题，您如何保持权益投资部三个部门的风格稳定？</p><p>    " +
            "王海涛：我觉得我们林总非常有前瞻性，他发现这个问题过去在基金行业长期存在以后，果断在2018年按照持有人风险偏好和我司基金经理的风格对公司旗下产品进行分类，" +
            "将原来的权益投资一部拆分设立为价值、成长、策略三个部门，明确每个部门的定位和发展方向并和持有人风险偏好匹配。</p><p>    价值投资部追寻价值回归，寻找长期具有竞争力的企业，风险偏好较低；" +
            "成长投资部追寻长期具有较高成长性的公司，忍受短期波动，获得比较好的长期收益，风险偏好较高；策略投资部则力求通过优秀的产品设计和多元的投资策略实现超额收益，风险偏好中等。</p><p>    " +
            "想要保持投资风格的稳定性，我觉得至少要从三方面着手：</p><p>    一是在考核上给予长期业绩更高的权重。在广发基金，我们并不会刻意追求短期的业绩，但是要求你无论什么时候风格必须稳定。" +
            "如果基金经理业绩不佳，我们会先分析是不是市场风格不匹配，如果是因为市场风格的问题，我们会容忍基金经理阶段性的业绩落后。</p><p>    二是对投资过程进行管理。" +
            "每个季度，我们会对基金经理的投资行为进行跟踪，通过持仓品种的估值、成长性、换手率、买卖理由等来考察基金经理构建的组合是否与其所说的策略一致，评估风格是否稳定、持续。</p><p>    " +
            "三是定期跟踪总结，通过科学的数据分析、不断改进投资理念和方法，不断优化投资流程。</p><p>    从海外资产管理公司的发展实践来看，对基金经理来说，" +
            "最重要的是在组合构建、个股选择等方面坚持一致的投资策略，这样下来，中长期表现一定是不错的。当然，短期不好说，因为市场每隔一段时间可能会发生比较大的风格变化，短期业绩带有意外、运气等因素。</p><p>   " +
            " 因此，我们对基金经理的要求是，保持自己的风格，在同类产品中排名靠前。你可能在全市场基金中不一定靠前，但要在同类产品中做出Alpha。</p><p>    " +
            "朱昂：三个部门之间的交流机制是怎样的？背后是否有统一的投资价值观？</p><p>    王海涛：三个部门的交流机制比较顺畅，每个组根据自己的风格投资，三个部门每周有自己的部门例会，对其他部门也是开放的。" +
            "你会经常看到成长投资部开会时，策略部和价值部同事也参与讨论。</p><p>    每个月，我们组织投研内部讨论会，三个权益部门和研究部的核心团队都会参加。" +
            "此外，每个季度，我们会在北京、上海、广州等地组织团建活动，让成员进行充分的交流和互动。</p><p>    至于团队的统一价值观，我们归纳为八个字：“诚信，进取，稳健，长远”。" +
            "资产管理行业的本质是帮助客户理财，诚信一定是放在第一位。其次是进取，每个人的能力都是有限的，必须不断学习，不断进取才能在变化的市场环境中越做越好。第三是稳健，投资风格稳健很重要，" +
            "只有控制好组合的回撤，才能提高持有人的体验。最后是长远，所有的目标都是基于长远。当你考虑到自己从事的是五年、十年甚至一辈子的工作时，你会更注重长期目标，而不在乎短期一城一池的得失。</p><p>    " +
            "<strong>有长期业绩支撑的公司才能跑出来</strong></p><p>    朱昂：过去一年，资产管理行业和传统产业一样，出现了头部集中的效应，大家也很关注头部机构在规模和业绩上能否平衡好，" +
            "您怎么看这个问题？</p><p>    王海涛：最近几年，中长期业绩比较好的基金经理，获得销售渠道和客户的高度认可，基金管理规模有了比较明显的增长。当规模超过百亿以后，如何继续为客户带来比较稳定的超额收益，" +
            "这是头部资产管理机构在发展中面临的共性问题。</p><p>    我原来在美国读书，彼得·林奇是我们的校友，几十年前他就管理了上百亿美金，并且业绩优秀。回国后，我常常思考一个问题：" +
            "中国的经济和资管行业增速都很快，但我们的基金经理管理了上百亿资金后就会面临一些瓶颈，我们能否通过学习国外的经验，通过赋能的方式，在保持风格统一的前提下，为老百姓提供优秀的产品，" +
            "为持有人带来更好的长期投资体验？</p><p>    广发基金的投研体系化，就是解决容量和业绩之间的平衡问题。我们一直在思考和探索构建这样一个体制，" +
            "风格相似、能力圈有所差异的几位基金经理以团队协作的形式管理同一类基金，在保持风格稳定的前提下追求较好的超额收益。对比海外，美国有许多百亿美元以上的产品是采用团队协作、全球化配置的思路来管理。" +
            "我们希望通过增聘基金经理等方式，辅助规模大的基金经理管好产品。</p><p>    除了团队协作外，平滑组合波动也是我们关注的重点。当我们管理大资金后，会把风险控制放在更重要的位置，" +
            "投资目标会从高α、高波动的特征转向稳健超额。而要让大规模资金实现稳健超额，对流程管理要求更高。它要求投资标的的覆盖面更广，细分策略更加多元化，将涉及到基本面研究团队、量化、风控和宏观配置等体系化的支持。" +
            "从配置角度来看，我们所做的这些努力不一定能给权益基金带来更多超额，但对尾部风险控制会有帮助。</p><p>    朱昂：去年7月份，中国证监会易会满主席提出“公募基金要在提升权益类基金的占比上下功夫，" +
            "提高研究能力、丰富产品类型、提升投顾水平、优化投资结构，让权益类基金成为资本市场重要的长期专业投资者。”关于公募行业的发展趋势，能否谈谈您的看法？</p><p>    " +
            "王海涛：关于基金行业的发展趋势，这个话题比较大，我谈谈自己的一点思考。</p><p>    第一，风格明晰化可能是基金行业发展的必经之路。海外发展比较成熟的资产管理机构，如普信、JP摩根等，" +
            "他们的投资团队也是按照风格分成价值组、成长组、平衡组。这几年，国内基金行业也由过去的供不应求发展到供过于求的阶段，市场竞争越来越细分，专注于某个领域的产品更容易跑出来。</p><p>    " +
            "第二，有长期业绩和长期品牌的公司才能在竞争中胜出。就跟任何传统行业的发展一样，管理规模向头部集中将是大势所趋，只有真正有长期业绩支撑或者长期积淀的公司最终才能跑出来。未来十年，甚至二十年，" +
            "行业的头部效应会越来越明显。我们必须不断增强自己的实力，未来才有可能走得更远。</p><p>    第三，产品特点要足够鲜明，和持有人的需求匹配。持有人的风险偏好是分层的，" +
            "不同风险偏好的持有人不应该买同一类产品。例如，中低风险偏好的银行客户，更适合的是股债均衡的稳健产品；对具有配置能力的客户来说，具有Alpha能力的行业基金会是不错的选择。" +
            "通过主动管理的产品风格区分，我们希望基金持有人能找到匹配他们投资目标的产品。</p><p>    文章来源：点拾投资</p><p>    （CIS）</p>"
