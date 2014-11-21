package com.malinskiy.materialicons;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.widget.TextView;

import java.io.IOException;

import static android.text.Html.fromHtml;
import static android.text.Html.toHtml;
import static java.lang.String.valueOf;

public final class Iconify {

    private static final String TTF_FILE = "material-design-iconic-font-1.0.1.ttf";

    public static final String TAG = Iconify.class.getSimpleName();

    private static Typeface typeface = null;

    private Iconify() {
        // Prevent instantiation
    }

    /**
     * Transform the given TextViews replacing {icon_xxx} texts with icons.
     */
    public static final void addIcons(TextView... textViews) {
        for (TextView textView : textViews) {
            textView.setTypeface(getTypeface(textView.getContext()));
            textView.setText(compute(textView.getText()));
        }
    }

    public static CharSequence compute(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            String text = toHtml((Spanned) charSequence);
            return fromHtml(Utils.replaceIcons(new StringBuilder((text))).toString());
        }
        String text = charSequence.toString();
        return Utils.replaceIcons(new StringBuilder(text));
    }

    public static final void setIcon(TextView textView, IconValue value) {
        textView.setTypeface(getTypeface(textView.getContext()));
        textView.setText(valueOf(value.character));
    }

    /**
     * The typeface that contains FontAwesome icons.
     *
     * @return the typeface, or null if something goes wrong.
     */
    public static final Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromFile(Utils.resourceToFile(context, TTF_FILE));
            } catch (IOException e) {
                return null;
            }
        }
        return typeface;
    }

    public static enum IconValue {

        md_3d_rotation('\uf000'),
        md_accessibility('\uf001'),
        md_account_balance('\uf002'),
        md_account_balance_wallet('\uf003'),
        md_account_box('\uf004'),
        md_account_child('\uf005'),
        md_account_circle('\uf006'),
        md_add_shopping_cart('\uf007'),
        md_alarm('\uf008'),
        md_alarm_add('\uf009'),
        md_alarm_off('\uf00a'),
        md_alarm_on('\uf00b'),
        md_android('\uf00c'),
        md_announcement('\uf00d'),
        md_aspect_ratio('\uf00e'),
        md_assessment('\uf00f'),
        md_assignment('\uf010'),
        md_assignment_ind('\uf011'),
        md_assignment_late('\uf012'),
        md_assignment_return('\uf013'),
        md_assignment_returned('\uf014'),
        md_assignment_turned_in('\uf015'),
        md_autorenew('\uf016'),
        md_backup('\uf017'),
        md_book('\uf018'),
        md_bookmark('\uf019'),
        md_bookmark_outline('\uf01a'),
        md_bug_report('\uf01b'),
        md_cached('\uf01c'),
        md_class('\uf01d'),
        md_credit_card('\uf01e'),
        md_dashboard('\uf01f'),
        md_delete('\uf020'),
        md_description('\uf021'),
        md_dns('\uf022'),
        md_done('\uf023'),
        md_done_all('\uf024'),
        md_event('\uf025'),
        md_exit_to_app('\uf026'),
        md_explore('\uf027'),
        md_extension('\uf028'),
        md_face_unlock('\uf029'),
        md_favorite('\uf02a'),
        md_favorite_outline('\uf02b'),
        md_find_in_page('\uf02c'),
        md_find_replace('\uf02d'),
        md_flip_to_back('\uf02e'),
        md_flip_to_front('\uf02f'),
        md_get_app('\uf030'),
        md_grade('\uf031'),
        md_group_work('\uf032'),
        md_help('\uf033'),
        md_highlight_remove('\uf034'),
        md_history('\uf035'),
        md_home('\uf036'),
        md_https('\uf037'),
        md_info('\uf038'),
        md_info_outline('\uf039'),
        md_input('\uf03a'),
        md_invert_colors('\uf03b'),
        md_label('\uf03c'),
        md_label_outline('\uf03d'),
        md_language('\uf03e'),
        md_launch('\uf03f'),
        md_list('\uf040'),
        md_lock('\uf041'),
        md_lock_open('\uf042'),
        md_lock_outline('\uf043'),
        md_loyalty('\uf044'),
        md_markunread_mailbox('\uf045'),
        md_note_add('\uf046'),
        md_open_in_browser('\uf047'),
        md_open_in_new('\uf048'),
        md_open_with('\uf049'),
        md_pageview('\uf04a'),
        md_payment('\uf04b'),
        md_perm_camera_mic('\uf04c'),
        md_perm_contact_cal('\uf04d'),
        md_perm_data_setting('\uf04e'),
        md_perm_device_info('\uf04f'),
        md_perm_identity('\uf050'),
        md_perm_media('\uf051'),
        md_perm_phone_msg('\uf052'),
        md_perm_scan_wifi('\uf053'),
        md_picture_in_picture('\uf054'),
        md_polymer('\uf055'),
        md_print('\uf056'),
        md_query_builder('\uf057'),
        md_question_answer('\uf058'),
        md_receipt('\uf059'),
        md_redeem('\uf05a'),
        md_report_problem('\uf05b'),
        md_restore('\uf05c'),
        md_room('\uf05d'),
        md_schedule('\uf05e'),
        md_search('\uf05f'),
        md_settings('\uf060'),
        md_settings_applications('\uf061'),
        md_settings_backup_restore('\uf062'),
        md_settings_bluetooth('\uf063'),
        md_settings_cell('\uf064'),
        md_settings_display('\uf065'),
        md_settings_ethernet('\uf066'),
        md_settings_input_antenna('\uf067'),
        md_settings_input_component('\uf068'),
        md_settings_input_composite('\uf069'),
        md_settings_input_hdmi('\uf06a'),
        md_settings_input_svideo('\uf06b'),
        md_settings_overscan('\uf06c'),
        md_settings_phone('\uf06d'),
        md_settings_power('\uf06e'),
        md_settings_remote('\uf06f'),
        md_settings_voice('\uf070'),
        md_shop('\uf071'),
        md_shopping_basket('\uf072'),
        md_shopping_cart('\uf073'),
        md_shop_two('\uf074'),
        md_speaker_notes('\uf075'),
        md_spellcheck('\uf076'),
        md_star_rate('\uf077'),
        md_stars('\uf078'),
        md_store('\uf079'),
        md_subject('\uf07a'),
        md_swap_horiz('\uf07b'),
        md_swap_vert('\uf07c'),
        md_swap_vert_circle('\uf07d'),
        md_system_update_tv('\uf07e'),
        md_tab('\uf07f'),
        md_tab_unselected('\uf080'),
        md_theaters('\uf081'),
        md_thumb_down('\uf082'),
        md_thumbs_up_down('\uf083'),
        md_thumb_up('\uf084'),
        md_toc('\uf085'),
        md_today('\uf086'),
        md_track_changes('\uf087'),
        md_translate('\uf088'),
        md_trending_down('\uf089'),
        md_trending_neutral('\uf08a'),
        md_trending_up('\uf08b'),
        md_turned_in('\uf08c'),
        md_turned_in_not('\uf08d'),
        md_verified_user('\uf08e'),
        md_view_agenda('\uf08f'),
        md_view_array('\uf090'),
        md_view_carousel('\uf091'),
        md_view_column('\uf092'),
        md_view_day('\uf093'),
        md_view_headline('\uf094'),
        md_view_list('\uf095'),
        md_view_module('\uf096'),
        md_view_quilt('\uf097'),
        md_view_stream('\uf098'),
        md_view_week('\uf099'),
        md_visibility('\uf09a'),
        md_visibility_off('\uf09b'),
        md_wallet_giftcard('\uf09c'),
        md_wallet_membership('\uf09d'),
        md_wallet_travel('\uf09e'),
        md_work('\uf09f'),
        md_error('\uf0a0'),
        md_warning('\uf0a1'),
        md_album('\uf0a2'),
        md_av_timer('\uf0a3'),
        md_closed_caption('\uf0a4'),
        md_equalizer('\uf0a5'),
        md_explicit('\uf0a6'),
        md_fast_forward('\uf0a7'),
        md_fast_rewind('\uf0a8'),
        md_games('\uf0a9'),
        md_hearing('\uf0aa'),
        md_high_quality('\uf0ab'),
        md_loop('\uf0ac'),
        md_mic('\uf0ad'),
        md_mic_none('\uf0ae'),
        md_mic_off('\uf0af'),
        md_movie('\uf0b0'),
        md_my_library_add('\uf0b1'),
        md_my_library_books('\uf0b2'),
        md_my_library_music('\uf0b3'),
        md_new_releases('\uf0b4'),
        md_not_interested('\uf0b5'),
        md_pause('\uf0b6'),
        md_pause_circle_fill('\uf0b7'),
        md_pause_circle_outline('\uf0b8'),
        md_play_arrow('\uf0b9'),
        md_play_circle_fill('\uf0ba'),
        md_play_circle_outline('\uf0bb'),
        md_playlist_add('\uf0bc'),
        md_play_shopping_bag('\uf0bd'),
        md_queue('\uf0be'),
        md_queue_music('\uf0bf'),
        md_radio('\uf0c0'),
        md_recent_actors('\uf0c1'),
        md_repeat('\uf0c2'),
        md_repeat_one('\uf0c3'),
        md_replay('\uf0c4'),
        md_shuffle('\uf0c5'),
        md_skip_next('\uf0c6'),
        md_skip_previous('\uf0c7'),
        md_snooze('\uf0c8'),
        md_stop('\uf0c9'),
        md_subtitles('\uf0ca'),
        md_surround_sound('\uf0cb'),
        md_videocam('\uf0cc'),
        md_videocam_off('\uf0cd'),
        md_video_collection('\uf0ce'),
        md_volume_down('\uf0cf'),
        md_volume_mute('\uf0d0'),
        md_volume_off('\uf0d1'),
        md_volume_up('\uf0d2'),
        md_web('\uf0d3'),
        md_business('\uf0d4'),
        md_call('\uf0d5'),
        md_call_end('\uf0d6'),
        md_call_made('\uf0d7'),
        md_call_merge('\uf0d8'),
        md_call_missed('\uf0d9'),
        md_call_received('\uf0da'),
        md_call_split('\uf0db'),
        md_chat('\uf0dc'),
        md_clear_all('\uf0dd'),
        md_comment('\uf0de'),
        md_contacts('\uf0df'),
        md_dialer_sip('\uf0e0'),
        md_dialpad('\uf0e1'),
        md_dnd_on('\uf0e2'),
        md_email('\uf0e3'),
        md_forum('\uf0e4'),
        md_import_export('\uf0e5'),
        md_invert_colors_off('\uf0e6'),
        md_invert_colors_on('\uf0e7'),
        md_live_help('\uf0e8'),
        md_location_off('\uf0e9'),
        md_location_on('\uf0ea'),
        md_message('\uf0eb'),
        md_messenger('\uf0ec'),
        md_no_sim('\uf0ed'),
        md_phone('\uf0ee'),
        md_portable_wifi_off('\uf0ef'),
        md_quick_contacts_dialer('\uf0f0'),
        md_quick_contacts_mail('\uf0f1'),
        md_ring_volume('\uf0f2'),
        md_stay_current_landscape('\uf0f3'),
        md_stay_current_portrait('\uf0f4'),
        md_stay_primary_landscape('\uf0f5'),
        md_stay_primary_portrait('\uf0f6'),
        md_swap_calls('\uf0f7'),
        md_textsms('\uf0f8'),
        md_voicemail('\uf0f9'),
        md_vpn_key('\uf0fa'),
        md_add('\uf0fb'),
        md_add_box('\uf0fc'),
        md_add_circle('\uf0fd'),
        md_add_circle_outline('\uf0fe'),
        md_archive('\uf0ff'),
        md_backspace('\uf100'),
        md_block('\uf101'),
        md_clear('\uf102'),
        md_content_copy('\uf103'),
        md_content_cut('\uf104'),
        md_content_paste('\uf105'),
        md_create('\uf106'),
        md_drafts('\uf107'),
        md_filter_list('\uf108'),
        md_flag('\uf109'),
        md_forward('\uf10a'),
        md_gesture('\uf10b'),
        md_inbox('\uf10c'),
        md_link('\uf10d'),
        md_mail('\uf10e'),
        md_markunread('\uf10f'),
        md_redo('\uf110'),
        md_remove('\uf111'),
        md_remove_circle('\uf112'),
        md_remove_circle_outline('\uf113'),
        md_reply('\uf114'),
        md_reply_all('\uf115'),
        md_report('\uf116'),
        md_save('\uf117'),
        md_select_all('\uf118'),
        md_send('\uf119'),
        md_sort('\uf11a'),
        md_text_format('\uf11b'),
        md_undo('\uf11c'),
        md_access_alarm('\uf11d'),
        md_access_alarms('\uf11e'),
        md_access_time('\uf11f'),
        md_add_alarm('\uf120'),
        md_airplanemode_off('\uf121'),
        md_airplanemode_on('\uf122'),
        md_battery_20('\uf123'),
        md_battery_30('\uf124'),
        md_battery_50('\uf125'),
        md_battery_60('\uf126'),
        md_battery_80('\uf127'),
        md_battery_90('\uf128'),
        md_battery_alert('\uf129'),
        md_battery_charging_20('\uf12a'),
        md_battery_charging_30('\uf12b'),
        md_battery_charging_50('\uf12c'),
        md_battery_charging_60('\uf12d'),
        md_battery_charging_80('\uf12e'),
        md_battery_charging_90('\uf12f'),
        md_battery_charging_full('\uf130'),
        md_battery_full('\uf131'),
        md_battery_std('\uf132'),
        md_battery_unknown('\uf133'),
        md_bluetooth('\uf134'),
        md_bluetooth_connected('\uf135'),
        md_bluetooth_disabled('\uf136'),
        md_bluetooth_searching('\uf137'),
        md_brightness_auto('\uf138'),
        md_brightness_high('\uf139'),
        md_brightness_low('\uf13a'),
        md_brightness_medium('\uf13b'),
        md_data_usage('\uf13c'),
        md_developer_mode('\uf13d'),
        md_devices('\uf13e'),
        md_dvr('\uf13f'),
        md_gps_fixed('\uf140'),
        md_gps_not_fixed('\uf141'),
        md_gps_off('\uf142'),
        md_location_disabled('\uf143'),
        md_location_searching('\uf144'),
        md_multitrack_audio('\uf145'),
        md_network_cell('\uf146'),
        md_network_wifi('\uf147'),
        md_nfc('\uf148'),
        md_now_wallpaper('\uf149'),
        md_now_widgets('\uf14a'),
        md_screen_lock_landscape('\uf14b'),
        md_screen_lock_portrait('\uf14c'),
        md_screen_lock_rotation('\uf14d'),
        md_screen_rotation('\uf14e'),
        md_sd_storage('\uf14f'),
        md_settings_system_daydream('\uf150'),
        md_signal_cellular_0_bar('\uf151'),
        md_signal_cellular_1_bar('\uf152'),
        md_signal_cellular_2_bar('\uf153'),
        md_signal_cellular_3_bar('\uf154'),
        md_signal_cellular_4_bar('\uf155'),
        md_signal_cellular_connected_no_internet_0_bar('\uf156'),
        md_signal_cellular_connected_no_internet_1_bar('\uf157'),
        md_signal_cellular_connected_no_internet_2_bar('\uf158'),
        md_signal_cellular_connected_no_internet_3_bar('\uf159'),
        md_signal_cellular_connected_no_internet_4_bar('\uf15a'),
        md_signal_cellular_no_sim('\uf15b'),
        md_signal_cellular_null('\uf15c'),
        md_signal_cellular_off('\uf15d'),
        md_signal_wifi_0_bar('\uf15e'),
        md_signal_wifi_1_bar('\uf15f'),
        md_signal_wifi_2_bar('\uf160'),
        md_signal_wifi_3_bar('\uf161'),
        md_signal_wifi_4_bar('\uf162'),
        md_signal_wifi_off('\uf163'),
        md_storage('\uf164'),
        md_usb('\uf165'),
        md_wifi_lock('\uf166'),
        md_wifi_tethering('\uf167'),
        md_attach_file('\uf168'),
        md_attach_money('\uf169'),
        md_border_all('\uf16a'),
        md_border_bottom('\uf16b'),
        md_border_clear('\uf16c'),
        md_border_color('\uf16d'),
        md_border_horizontal('\uf16e'),
        md_border_inner('\uf16f'),
        md_border_left('\uf170'),
        md_border_outer('\uf171'),
        md_border_right('\uf172'),
        md_border_style('\uf173'),
        md_border_top('\uf174'),
        md_border_vertical('\uf175'),
        md_format_align_center('\uf176'),
        md_format_align_justify('\uf177'),
        md_format_align_left('\uf178'),
        md_format_align_right('\uf179'),
        md_format_bold('\uf17a'),
        md_format_clear('\uf17b'),
        md_format_color_fill('\uf17c'),
        md_format_color_reset('\uf17d'),
        md_format_color_text('\uf17e'),
        md_format_indent_decrease('\uf17f'),
        md_format_indent_increase('\uf180'),
        md_format_italic('\uf181'),
        md_format_line_spacing('\uf182'),
        md_format_list_bulleted('\uf183'),
        md_format_list_numbered('\uf184'),
        md_format_paint('\uf185'),
        md_format_quote('\uf186'),
        md_format_size('\uf187'),
        md_format_strikethrough('\uf188'),
        md_format_textdirection_l_to_r('\uf189'),
        md_format_textdirection_r_to_l('\uf18a'),
        md_format_underline('\uf18b'),
        md_functions('\uf18c'),
        md_insert_chart('\uf18d'),
        md_insert_comment('\uf18e'),
        md_insert_drive_file('\uf18f'),
        md_insert_emoticon('\uf190'),
        md_insert_invitation('\uf191'),
        md_insert_link('\uf192'),
        md_insert_photo('\uf193'),
        md_merge_type('\uf194'),
        md_mode_comment('\uf195'),
        md_mode_edit('\uf196'),
        md_publish('\uf197'),
        md_vertical_align_bottom('\uf198'),
        md_vertical_align_center('\uf199'),
        md_vertical_align_top('\uf19a'),
        md_wrap_text('\uf19b'),
        md_attachment('\uf19c'),
        md_cloud('\uf19d'),
        md_cloud_circle('\uf19e'),
        md_cloud_done('\uf19f'),
        md_cloud_download('\uf1a0'),
        md_cloud_off('\uf1a1'),
        md_cloud_queue('\uf1a2'),
        md_cloud_upload('\uf1a3'),
        md_file_download('\uf1a4'),
        md_file_upload('\uf1a5'),
        md_folder('\uf1a6'),
        md_folder_open('\uf1a7'),
        md_folder_shared('\uf1a8'),
        md_cast('\uf1a9'),
        md_cast_connected('\uf1aa'),
        md_computer('\uf1ab'),
        md_desktop_mac('\uf1ac'),
        md_desktop_windows('\uf1ad'),
        md_dock('\uf1ae'),
        md_gamepad('\uf1af'),
        md_headset('\uf1b0'),
        md_headset_mic('\uf1b1'),
        md_keyboard('\uf1b2'),
        md_keyboard_alt('\uf1b3'),
        md_keyboard_arrow_down('\uf1b4'),
        md_keyboard_arrow_left('\uf1b5'),
        md_keyboard_arrow_right('\uf1b6'),
        md_keyboard_arrow_up('\uf1b7'),
        md_keyboard_backspace('\uf1b8'),
        md_keyboard_capslock('\uf1b9'),
        md_keyboard_control('\uf1ba'),
        md_keyboard_hide('\uf1bb'),
        md_keyboard_return('\uf1bc'),
        md_keyboard_tab('\uf1bd'),
        md_keyboard_voice('\uf1be'),
        md_laptop('\uf1bf'),
        md_laptop_chromebook('\uf1c0'),
        md_laptop_mac('\uf1c1'),
        md_laptop_windows('\uf1c2'),
        md_memory('\uf1c3'),
        md_mouse('\uf1c4'),
        md_phone_android('\uf1c5'),
        md_phone_iphone('\uf1c6'),
        md_phonelink('\uf1c7'),
        md_phonelink_off('\uf1c8'),
        md_security('\uf1c9'),
        md_sim_card('\uf1ca'),
        md_smartphone('\uf1cb'),
        md_speaker('\uf1cc'),
        md_tablet('\uf1cd'),
        md_tablet_android('\uf1ce'),
        md_tablet_mac('\uf1cf'),
        md_tv('\uf1d0'),
        md_watch('\uf1d1'),
        md_add_to_photos('\uf1d2'),
        md_adjust('\uf1d3'),
        md_assistant_photo('\uf1d4'),
        md_audiotrack('\uf1d5'),
        md_blur_circular('\uf1d6'),
        md_blur_linear('\uf1d7'),
        md_blur_off('\uf1d8'),
        md_blur_on('\uf1d9'),
        md_brightness_1('\uf1da'),
        md_brightness_2('\uf1db'),
        md_brightness_3('\uf1dc'),
        md_brightness_4('\uf1dd'),
        md_brightness_5('\uf1de'),
        md_brightness_6('\uf1df'),
        md_brightness_7('\uf1e0'),
        md_brush('\uf1e1'),
        md_camera('\uf1e2'),
        md_camera_alt('\uf1e3'),
        md_camera_front('\uf1e4'),
        md_camera_rear('\uf1e5'),
        md_camera_roll('\uf1e6'),
        md_center_focus_strong('\uf1e7'),
        md_center_focus_weak('\uf1e8'),
        md_collections('\uf1e9'),
        md_colorize('\uf1ea'),
        md_color_lens('\uf1eb'),
        md_compare('\uf1ec'),
        md_control_point('\uf1ed'),
        md_control_point_duplicate('\uf1ee'),
        md_crop('\uf1ef'),
        md_crop_3_2('\uf1f0'),
        md_crop_5_4('\uf1f1'),
        md_crop_7_5('\uf1f2'),
        md_crop_16_9('\uf1f3'),
        md_crop_din('\uf1f4'),
        md_crop_free('\uf1f5'),
        md_crop_landscape('\uf1f6'),
        md_crop_original('\uf1f7'),
        md_crop_portrait('\uf1f8'),
        md_crop_square('\uf1f9'),
        md_dehaze('\uf1fa'),
        md_details('\uf1fb'),
        md_edit('\uf1fc'),
        md_exposure('\uf1fd'),
        md_exposure_minus_1('\uf1fe'),
        md_exposure_minus_2('\uf1ff'),
        md_exposure_zero('\uf200'),
        md_exposure_plus_1('\uf201'),
        md_exposure_plus_2('\uf202'),
        md_filter('\uf203'),
        md_filter_1('\uf204'),
        md_filter_2('\uf205'),
        md_filter_3('\uf206'),
        md_filter_4('\uf207'),
        md_filter_5('\uf208'),
        md_filter_6('\uf209'),
        md_filter_7('\uf20a'),
        md_filter_8('\uf20b'),
        md_filter_9('\uf20c'),
        md_filter_9_plus('\uf20d'),
        md_filter_b_and_w('\uf20e'),
        md_filter_center_focus('\uf20f'),
        md_filter_drama('\uf210'),
        md_filter_frames('\uf211'),
        md_filter_hdr('\uf212'),
        md_filter_none('\uf213'),
        md_filter_tilt_shift('\uf214'),
        md_filter_vintage('\uf215'),
        md_flare('\uf216'),
        md_flash_auto('\uf217'),
        md_flash_off('\uf218'),
        md_flash_on('\uf219'),
        md_flip('\uf21a'),
        md_gradient('\uf21b'),
        md_grain('\uf21c'),
        md_grid_off('\uf21d'),
        md_grid_on('\uf21e'),
        md_hdr_off('\uf21f'),
        md_hdr_on('\uf220'),
        md_hdr_strong('\uf221'),
        md_hdr_weak('\uf222'),
        md_healing('\uf223'),
        md_image('\uf224'),
        md_image_aspect_ratio('\uf225'),
        md_iso('\uf226'),
        md_landscape('\uf227'),
        md_leak_add('\uf228'),
        md_leak_remove('\uf229'),
        md_lens('\uf22a'),
        md_looks('\uf22b'),
        md_looks_1('\uf22c'),
        md_looks_2('\uf22d'),
        md_looks_3('\uf22e'),
        md_looks_4('\uf22f'),
        md_looks_5('\uf230'),
        md_looks_6('\uf231'),
        md_loupe('\uf232'),
        md_movie_creation('\uf233'),
        md_nature('\uf234'),
        md_nature_people('\uf235'),
        md_navigate_before('\uf236'),
        md_navigate_next('\uf237'),
        md_palette('\uf238'),
        md_panorama('\uf239'),
        md_panorama_fisheye('\uf23a'),
        md_panorama_horizontal('\uf23b'),
        md_panorama_vertical('\uf23c'),
        md_panorama_wide_angle('\uf23d'),
        md_photo('\uf23e'),
        md_photo_album('\uf23f'),
        md_photo_camera('\uf240'),
        md_photo_library('\uf241'),
        md_portrait('\uf242'),
        md_remove_red_eye('\uf243'),
        md_rotate_left('\uf244'),
        md_rotate_right('\uf245'),
        md_slideshow('\uf246'),
        md_straighten('\uf247'),
        md_style('\uf248'),
        md_switch_camera('\uf249'),
        md_switch_video('\uf24a'),
        md_tag_faces('\uf24b'),
        md_texture('\uf24c'),
        md_timelapse('\uf24d'),
        md_timer('\uf24e'),
        md_timer_3('\uf24f'),
        md_timer_10('\uf250'),
        md_timer_auto('\uf251'),
        md_timer_off('\uf252'),
        md_tonality('\uf253'),
        md_transform('\uf254'),
        md_tune('\uf255'),
        md_wb_auto('\uf256'),
        md_wb_cloudy('\uf257'),
        md_wb_incandescent('\uf258'),
        md_wb_irradescent('\uf259'),
        md_wb_sunny('\uf25a'),
        md_beenhere('\uf25b'),
        md_directions('\uf25c'),
        md_directions_bike('\uf25d'),
        md_directions_bus('\uf25e'),
        md_directions_car('\uf25f'),
        md_directions_ferry('\uf260'),
        md_directions_subway('\uf261'),
        md_directions_train('\uf262'),
        md_directions_transit('\uf263'),
        md_directions_walk('\uf264'),
        md_flight('\uf265'),
        md_hotel('\uf266'),
        md_layers('\uf267'),
        md_layers_clear('\uf268'),
        md_local_airport('\uf269'),
        md_local_atm('\uf26a'),
        md_local_attraction('\uf26b'),
        md_local_bar('\uf26c'),
        md_local_cafe('\uf26d'),
        md_local_car_wash('\uf26e'),
        md_local_convenience_store('\uf26f'),
        md_local_drink('\uf270'),
        md_local_florist('\uf271'),
        md_local_gas_station('\uf272'),
        md_local_grocery_store('\uf273'),
        md_local_hospital('\uf274'),
        md_local_hotel('\uf275'),
        md_local_laundry_service('\uf276'),
        md_local_library('\uf277'),
        md_local_mall('\uf278'),
        md_local_movies('\uf279'),
        md_local_offer('\uf27a'),
        md_local_parking('\uf27b'),
        md_local_pharmacy('\uf27c'),
        md_local_phone('\uf27d'),
        md_local_pizza('\uf27e'),
        md_local_play('\uf27f'),
        md_local_post_office('\uf280'),
        md_local_print_shop('\uf281'),
        md_local_restaurant('\uf282'),
        md_local_see('\uf283'),
        md_local_shipping('\uf284'),
        md_local_taxi('\uf285'),
        md_location_history('\uf286'),
        md_map('\uf287'),
        md_my_location('\uf288'),
        md_navigation('\uf289'),
        md_pin_drop('\uf28a'),
        md_place('\uf28b'),
        md_rate_review('\uf28c'),
        md_restaurant_menu('\uf28d'),
        md_satellite('\uf28e'),
        md_store_mall_directory('\uf28f'),
        md_terrain('\uf290'),
        md_traffic('\uf291'),
        md_apps('\uf292'),
        md_cancel('\uf293'),
        md_arrow_drop_down_circle('\uf294'),
        md_arrow_drop_down('\uf295'),
        md_arrow_drop_up('\uf296'),
        md_arrow_back('\uf297'),
        md_arrow_forward('\uf298'),
        md_check('\uf299'),
        md_close('\uf29a'),
        md_chevron_left('\uf29b'),
        md_chevron_right('\uf29c'),
        md_expand_less('\uf29d'),
        md_expand_more('\uf29e'),
        md_fullscreen('\uf29f'),
        md_fullscreen_exit('\uf2a0'),
        md_menu('\uf2a1'),
        md_more_horiz('\uf2a2'),
        md_more_vert('\uf2a3'),
        md_refresh('\uf2a4'),
        md_unfold_less('\uf2a5'),
        md_unfold_more('\uf2a6'),
        md_adb('\uf2a7'),
        md_bluetooth_audio('\uf2a8'),
        md_disc_full('\uf2a9'),
        md_dnd_forwardslash('\uf2aa'),
        md_do_not_disturb('\uf2ab'),
        md_drive_eta('\uf2ac'),
        md_event_available('\uf2ad'),
        md_event_busy('\uf2ae'),
        md_event_note('\uf2af'),
        md_folder_special('\uf2b0'),
        md_mms('\uf2b1'),
        md_more('\uf2b2'),
        md_network_locked('\uf2b3'),
        md_phone_bluetooth_speaker('\uf2b4'),
        md_phone_forwarded('\uf2b5'),
        md_phone_in_talk('\uf2b6'),
        md_phone_locked('\uf2b7'),
        md_phone_missed('\uf2b8'),
        md_phone_paused('\uf2b9'),
        md_play_download('\uf2ba'),
        md_play_install('\uf2bb'),
        md_sd_card('\uf2bc'),
        md_sim_card_alert('\uf2bd'),
        md_sms('\uf2be'),
        md_sms_failed('\uf2bf'),
        md_sync('\uf2c0'),
        md_sync_disabled('\uf2c1'),
        md_sync_problem('\uf2c2'),
        md_system_update('\uf2c3'),
        md_tap_and_play('\uf2c4'),
        md_time_to_leave('\uf2c5'),
        md_vibration('\uf2c6'),
        md_voice_chat('\uf2c7'),
        md_vpn_lock('\uf2c8'),
        md_cake('\uf2c9'),
        md_domain('\uf2ca'),
        md_location_city('\uf2cb'),
        md_mood('\uf2cc'),
        md_notifications_none('\uf2cd'),
        md_notifications('\uf2ce'),
        md_notifications_off('\uf2cf'),
        md_notifications_on('\uf2d0'),
        md_notifications_paused('\uf2d1'),
        md_pages('\uf2d2'),
        md_party_mode('\uf2d3'),
        md_group('\uf2d4'),
        md_group_add('\uf2d5'),
        md_people('\uf2d6'),
        md_people_outline('\uf2d7'),
        md_person('\uf2d8'),
        md_person_add('\uf2d9'),
        md_person_outline('\uf2da'),
        md_plus_one('\uf2db'),
        md_poll('\uf2dc'),
        md_public('\uf2dd'),
        md_school('\uf2de'),
        md_share('\uf2df'),
        md_whatshot('\uf2e0'),
        md_check_box('\uf2e1'),
        md_check_box_outline_blank('\uf2e2'),
        md_radio_button_off('\uf2e3'),
        md_radio_button_on('\uf2e4'),
        md_star('\uf2e5'),
        md_star_half('\uf2e6'),
        md_star_outline('\uf2e7');

        char character;

        IconValue(char character) {
            this.character = character;
        }

        public String formattedName() {
            return "{" + name() + "}";
        }

        public char character() {
            return character;
        }
    }
}