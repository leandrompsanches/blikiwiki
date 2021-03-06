package info.bliki.api;

public class TestXMLPagesParser {

	private static String MAIN_PAGE_XML = "<?xml version=\"1.0\" encoding=\"utf-8\"?><api><query><pages><page pageid=\"46907\" ns=\"0\" title=\"API\"><revisions><rev>{{MovedToMediaWiki|API}}\n"
			+ "\n"
			+ "Moved preserving full histories. \'\'\'[[User:Robchurch|robchurch]]\'\'\' | [[User_talk:Robchurch|talk]] 07:09, 14 May 2007 (UTC)</rev></revisions></page><page pageid=\"79155\" ns=\"0\" title=\"Main Page\"><revisions><rev>{| width=&quot;100%&quot; cellpadding=&quot;0&quot; cellspacing=&quot;0&quot; style=&quot;border:1px solid #ffcc00; background:#FFFDDF; padding-left:0.5em; padding-right:0.5em; padding-top:0.3em; padding-bottom:0.1em;&quot;\n"
			+ "|-\n"
			+ "| width=&quot;27%&quot; align=&quot;center&quot; | &lt;font style=&quot;font-family:Verdana,Arial,Helvetica;&quot;&gt;&lt;big&gt;\'\'\'[[Wikimedia projects|Projects]]\'\'\'&lt;/big&gt;&lt;/font&gt;&lt;br/&gt;\n"
			+ "\'\'[[Complete list of Wikimedia projects|Complete list]]\'\' |  \'\'[[Proposals for new projects|Proposals]]\'\'\n"
			+ "| width=&quot;42%&quot; align=center | &lt;font style=&quot;font-family:Verdana,Arial,Helvetica;&quot;&gt;&lt;big&gt;\'\'\'[[Board of Trustees]]\'\'\'&lt;/big&gt;&lt;/font&gt;&lt;br/&gt; \n"
			+ "\'\'\'[[Wikimedia:Home|Wikimedia Foundation]]\'\'\' | \'\'\'[[Wikimedia_meetings|Meetings]]\'\'\' &lt;!--| \'\'\'[[Election results 2006|Election]]\'\'\'--&gt;\n"
			+ "| align=center | &lt;font style=&quot;font-family:Verdana,Arial,Helvetica;&quot;&gt;&lt;big&gt;\'\'\'[[Translation requests|Translations]]\'\'\'&lt;/big&gt;&lt;/font&gt;&lt;br/&gt; \n"
			+ "\'\'[[Translation_requests/WMF|Foundation]]\'\' | \'\'[[Translation request/WMF/Fundraising/2006|Donation form]]\'\' | \'\'[[Wikimedia press releases|press releases]]\'\' &lt;!--\n"
			+ "| \'\'[[Translation_requests/Wikimania|Wikimania]]\'\'--&gt;\n"
			+ "|}\n"
			+ "{| width=&quot;100%&quot; cellspacing=12 cellpadding=0\n"
			+ "| \'\'\'Welcome\'\'\' to [[Meta:About|Meta-Wiki]], a website devoted to the coordination of the [[Wikimedia Foundation]]\'s projects, including [[Wikipedia]], the free encyclopedia, and the [[MediaWiki]] software on which it runs.  Other venues for discussing the Foundation and these projects include the Wikimedia [[Mailing lists/overview|mailing lists]] (particularly [http://mail.wikipedia.org/mailman/listinfo/foundation-l \'\'\'foundation-l\'\'\']) and the various [[IRC channels]].\n"
			+ "|align=&quot;right&quot;| &lt;small&gt;Content pages on Meta: \'\'\'{{NUMBEROFARTICLES}}\'\'\'&lt;/small&gt;&lt;br /&gt;\n"
			+ "|}\n"
			+ "{| cellpadding=0 cellspacing=1\n"
			+ "|- valign=&quot;top&quot;\n"
			+ "|style=&quot;border: 1px solid gray;padding-left:1em;padding-right:0.5em;background:#FFEFF0;&quot; class=&quot;plainlinks&quot; colspan=&quot;2&quot;|\n"
			+ "\n"
			+ "&lt;span style=&quot;font-size: 130%;&quot;&gt;\'\'\'[[Multilingualism|Meta in many languages]]\'\'\'&lt;/span&gt;&lt;br/&gt;\n"
			+ "\'\'&lt;small&gt;[[Template:MetaHomePages|Edit this list:]]&lt;/small&gt;\'\' &lt;small&gt;{{MetaHomePages}}&lt;/small&gt;\n"
			+ "|- valign=&quot;top&quot;\n"
			+ "|style=&quot;border: 1px solid gray;padding-left:1em;padding-right:0.5em;background:#E4FFDF;padding-bottom:0.5em;&quot; width=&quot;45%&quot;|\n"
			+ "==Meta utilities==\n"
			+ "\n"
			+ "===Requests for...===\n"
			+ "* [[Requests for permissions|Permissions]] (to request sysop, bureaucrat and checkuser status on any Wikimedia wiki)\n"
			+ "* [[Requests for bot status|Bot status]]\n"
			+ "* [[Requests for queries|SQL queries]] \n"
			+ "* [[Requests for CheckUser information|CheckUser queries]] (not [[Checkuser#Access|CheckUser access]])\n"
			+ "* [[Meta:Requests for deletion|Deletion]] / [[Meta:Requests for undeletion|Undeletion]] / [[:Category:Deleteme|Speedy deletion]] / [[Multilingual speedy deletions]]\n"
			+ "* [[Translation requests|Translation]]\n"
			+ "* [[Requests for logos|Logos]]\n"
			+ "* [[Talk:Spam blacklist|Spam blacklisting]]\n"
			+ "\n"
			+ "===Other tools===\n"
			+ "\n"
			+ "* [[Meta:Sandbox|Sandbox]]\n"
			+ "* [[Meta:Babel templates|Babel templates]] (language skill)\n"
			+ "* [[Transbabel]] templates (translators by language combo)\n"
			+ "* [[Meta:Categories|Browse Meta-Wiki by category]]\n"
			+ "\n"
			+ "===Form &amp; Content===\n"
			+ "\n"
			+ "Organize and prepare content, e.g. templates, language files, logos, formats; Copyright issues&lt;br/&gt;\n"
			+ "\'\'See [[Wikimedia content]]\'\'\n"
			+ "* [[Help:Images and other uploaded files|Image]]\n"
			+ "* [[Maps]]\n"
			+ "* [[Copyright]]\n"
			+ "* [[Statistics]]\n"
			+ "\n"
			+ "|valign=&quot;top&quot; bgcolor=&quot;#E8F1FF&quot; style=&quot;border-style:solid;border-width:1px;border-color:gray;padding-left:1em;padding-right:0.5em; padding-bottom:0.5em;&quot; width=&quot;55%&quot;|\n"
			+ "==Latest news==\n"
			+ "{{Information thread}}\n"
			+ "\n"
			+ "|- valign=&quot;top&quot;\n"
			+ "|colspan=&quot;2&quot; style=&quot;border: 1px solid gray;padding-left:1em;padding-right:0.5em;padding-bottom:0.5em;&quot;|\n"
			+ "==Wikimedia Foundation==\n"
			+ "\n"
			+ "{{Wikimedia Foundation}}\n"
			+ "|- valign=&quot;top&quot;\n"
			+ "|colspan=&quot;2&quot; style=&quot;border: 1px solid gray;padding-left:1em;padding-right:0.5em;padding-bottom:0.5em;&quot;|\n"
			+ "==Code &amp; technical issues==\n"
			+ "Coordination of the development process, maintenance of servers, and user guide for MediaWiki.&lt;br /&gt;\n"
			+ "{{MediaWiki links|param=width=&quot;30%&quot;}}\n"
			+ "|- valign=&quot;top&quot;\n"
			+ "|style=&quot;border: 1px solid gray;padding-left:1em;padding-right:0.5em;padding-bottom:0.5em;&quot; width=&quot;40%&quot;|\n"
			+ "==Community &amp; Communication==\n"
			+ "About the community itself. Organisation of events; philosophical discussions; collaborated essays.\n"
			+ "\n"
			+ "* [[The Wikipedia Community]]\n"
			+ "* [[Wikipedian]]\n"
			+ "* [[Meta:Babel]] (central discussion place here)\n"
			+ "* [[Wikimedia Embassy]] (local contacts)\n"
			+ "* [[We need your help|Requests for help]] to your trouble\n"
			+ "* [[Mailing list|Mailing Lists]] &amp; [[IRC channels]]\n"
			+ "* [[Meetup|Wikipedia meetup]] (meetings between participants)\n"
			+ "* [[User classes|Status]] (various types of status, sysop, developer...)\n"
			+ "\n"
			+ "|valign=&quot;top&quot; style=&quot;border: 1px solid gray;padding-left:1em;padding-right:0.5em;padding-bottom:0.5em;&quot;|\n"
			+ "==Core issues &amp; collaboration==\n"
			+ "\n"
			+ "Helping contribute and collaborate (i.e., what makes it easy, what makes it hard, how to do it well, why you have to, what conflicts typically arise, fixing them). Discussing and formulating project-wide (i.e. not language-specific) policies.\n"
			+ "\n"
			+ "* [[Transfer of authority]]\n"
			+ "* [[Wikimedia principles]] (wikiquette, consensus, NPOV, copyrights)\n"
			+ "* [[Growing Wikimedia]] (building the project and the [[community]])\n"
			+ "* [[Power structure|Wikimedia power structure]]\n"
			+ "* [[Interlingual coordination]] (various international issues)\n"
			+ "* [[Wikipedia policies]]\n"
			+ "* [[Dispute resolution|Conflict resolution]]\n"
			+ "* [[Privacy policy]]\n"
			+ "|}\n"
			+ "__NOTOC__\n" + "__NOEDITSECTION__\n" + "[[Category:Main page]]</rev></revisions></page></pages></query></api>";

	public static void main(String args[]) throws Exception {
		XMLPagesParser parser = new XMLPagesParser(MAIN_PAGE_XML);
		parser.parse();
		System.out.println(parser.getPagesList());
	}

}
